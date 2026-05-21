package com.depi.portfolio.repository;

import java.util.Arrays;

public class InMemoryScoreRepository {
    private final int[] scores;

    public InMemoryScoreRepository(int[] scores) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("Scores cannot be null or empty");
        }
        this.scores = Arrays.copyOf(scores, scores.length);
    }

    public int[] findAll() {
        return Arrays.copyOf(scores, scores.length);
    }
}
