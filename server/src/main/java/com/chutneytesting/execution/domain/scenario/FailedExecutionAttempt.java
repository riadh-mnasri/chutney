package com.chutneytesting.execution.domain.scenario;

public class FailedExecutionAttempt extends RuntimeException {
    public final Long executionId;
    public final String title;

    public FailedExecutionAttempt(Exception exception, Long executionId, String title) {
        super(exception);
        this.executionId = executionId;
        this.title = title;
    }
}
