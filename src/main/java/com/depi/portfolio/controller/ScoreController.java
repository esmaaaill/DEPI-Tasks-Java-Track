package com.depi.portfolio.controller;

import com.depi.portfolio.model.ScoreReport;
import com.depi.portfolio.service.ScoreAnalyticsService;

public class ScoreController {
    private final ScoreAnalyticsService analyticsService;

    public ScoreController(ScoreAnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }

    public ScoreReport getScoreReport(int targetScore) {
        return analyticsService.generateReport(targetScore);
    }
}
