package br.com.mk.core;

import br.com.mk.exception.RestClientException;

import java.io.Serializable;

public interface RestClientTarget extends Serializable {

    public void host(final RestClientHost host);

    public <T> T getService(final Class<T> service) throws RestClientException;

    public <T> T getService(final Class<T> service, final Class<?>... parameterTypesConstructors) throws RestClientException;

    public RestClientHost getHost();

}
