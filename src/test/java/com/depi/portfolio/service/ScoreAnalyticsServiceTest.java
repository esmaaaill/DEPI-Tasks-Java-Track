package com.depi.portfolio.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import com.depi.portfolio.model.ScoreReport;
import com.depi.portfolio.repository.InMemoryScoreRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ScoreAnalyticsServiceTest {

    @Test
    void shouldGenerateExpectedReport() {
        InMemoryScoreRepository repository = new InMemoryScoreRepository(new int[]{85, 92, 78, 96, 88});
        ScoreAnalyticsService service = new ScoreAnalyticsService(repository);

        ScoreReport report = service.generateReport(92);

        assertEquals(96, report.maxScore());
        assertEquals(87.8, report.averageScore(), 0.0001);
        assertEquals(1, report.foundIndex());
    }

    @Test
    void shouldReturnMinusOneWhenTargetNotFound() {
        InMemoryScoreRepository repository = new InMemoryScoreRepository(new int[]{50, 60});
        ScoreAnalyticsService service = new ScoreAnalyticsService(repository);

        ScoreReport report = service.generateReport(99);

        assertEquals(-1, report.foundIndex());
    }

    @Test
    void shouldThrowForEmptyRepositoryData() {
        assertThrows(IllegalArgumentException.class, () -> new InMemoryScoreRepository(new int[]{}));
    }

    @Test
    void shouldUseMockitoStubbedRepository() {
        InMemoryScoreRepository repository = Mockito.mock(InMemoryScoreRepository.class);
        when(repository.findAll()).thenReturn(new int[]{90, 91, 92});
        ScoreAnalyticsService service = new ScoreAnalyticsService(repository);

        ScoreReport report = service.generateReport(91);

        assertEquals(92, report.maxScore());
        assertEquals(91.0, report.averageScore(), 0.0001);
        assertEquals(1, report.foundIndex());
    }
}
