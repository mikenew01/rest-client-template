package br.com.mk.exception;

public class RestClientException extends Exception {

    private Long code;
    private Exception exception;

    public RestClientException(final String message) {
        super(message);
    }

    public RestClientException(final Throwable throwable) {
        super(throwable);
    }

    public RestClientException(final Exception exception) {
        super(exception);
    }

    public RestClientException(final String message, Exception exception) {
        super(message, exception.getCause());
    }

    public RestClientException(final String message, Throwable throwable) {
        super(message, throwable);
    }

    public Exception getException() {
        return exception;
    }

    public Long getCode() {
        return code;
    }

}
