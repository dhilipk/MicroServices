package com.mytrip.customer.authenticationserver.exception;

public class InvalidClientException extends Exception {

    public InvalidClientException() {
    }

    public InvalidClientException(String message) {
        super(message);
    }

    public InvalidClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidClientException(Throwable cause) {
        super(cause);
    }

    public InvalidClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
