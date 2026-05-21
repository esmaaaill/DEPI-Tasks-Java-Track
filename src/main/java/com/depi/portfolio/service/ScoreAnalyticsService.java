package com.depi.portfolio.service;

import com.depi.portfolio.model.ScoreReport;
import com.depi.portfolio.repository.InMemoryScoreRepository;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScoreAnalyticsService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScoreAnalyticsService.class);
    private final InMemoryScoreRepository repository;

    public ScoreAnalyticsService(InMemoryScoreRepository repository) {
        this.repository = repository;
    }

    public ScoreReport generateReport(int targetScore) {
        int[] scores = repository.findAll();
        LOGGER.info("Generating report for {} score entries", scores.length);

        int max = Arrays.stream(scores).max().orElseThrow(() -> new IllegalStateException("No scores found"));
        double average = Arrays.stream(scores).average().orElse(0.0);
        int index = findIndex(scores, targetScore);

        return new ScoreReport(max, average, index);
    }

    protected int findIndex(int[] scores, int targetScore) {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == targetScore) {
                return i;
            }
        }
        return -1;
    }
}
