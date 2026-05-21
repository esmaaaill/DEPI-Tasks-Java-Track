package com.depi.portfolio.app;

import com.depi.portfolio.controller.ScoreController;
import com.depi.portfolio.model.ScoreReport;
import com.depi.portfolio.repository.InMemoryScoreRepository;
import com.depi.portfolio.service.ScoreAnalyticsService;

public class PortfolioApplication {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88};
        int targetScore = 92;

        InMemoryScoreRepository repository = new InMemoryScoreRepository(scores);
        ScoreAnalyticsService service = new ScoreAnalyticsService(repository);
        ScoreController controller = new ScoreController(service);

        ScoreReport report = controller.getScoreReport(targetScore);

        System.out.printf("Max Score: %d%n", report.maxScore());
        System.out.printf("Average Score: %.2f%n", report.averageScore());
        System.out.printf("Index of %d: %d%n", targetScore, report.foundIndex());
    }
}
