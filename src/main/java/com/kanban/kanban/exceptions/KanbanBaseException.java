package com.kanban.kanban.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Set;

public class KanbanBaseException extends RuntimeException {

    @Getter
    private final HttpStatus responseHttpStatus;

    @Getter
    private String errorCode;

    @Getter
    private Set<?> validationSet;

    public KanbanBaseException(final String message, final HttpStatus responseHttpStatus, final Throwable cause) {
        super(message, cause);
        this.responseHttpStatus = responseHttpStatus;
    }

    public KanbanBaseException(final String message, final HttpStatus responseHttpStatus, final Throwable cause,
            String errorCode) {
        super(message, cause);
        this.responseHttpStatus = responseHttpStatus;
        this.errorCode = errorCode;
    }

    public KanbanBaseException(final String message, final HttpStatus responseHttpStatus, final Throwable cause,
            String errorCode, Set<?> validationSet) {
        super(message, cause);
        this.responseHttpStatus = responseHttpStatus;
        this.errorCode = errorCode;
        this.validationSet = validationSet;
    }

}
