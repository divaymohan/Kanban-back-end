package com.kanban.kanban.exceptions;

import org.springframework.http.HttpStatus;

public class KanbanUserException extends KanbanBaseException{
    public KanbanUserException(String message) {
        super(message, HttpStatus.BAD_REQUEST, null);
    }

    public KanbanUserException(String message,String errorCode) {
        super(message, HttpStatus.BAD_REQUEST, null,errorCode);
    }

    public KanbanUserException(String message, Throwable cause) {
        super(message, HttpStatus.BAD_REQUEST, cause);
    }
}
