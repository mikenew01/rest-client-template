package br.com.mk.core;

import br.com.mk.exception.RestClientException;

import java.lang.reflect.InvocationTargetException;

public final class RestClientTargetImpl implements RestClientTarget {

    private RestClientHost host;

    @Override
    public void host(final RestClientHost host) {
        this.host = host;
    }

    @Override
    public <T> T getService(final Class<T> service) throws RestClientException {
        return getService(service, String.class);
    }

    @Override
    public <T> T getService(final Class<T> service, final Class<?>... parameterTypesConstructors) throws RestClientException {
        try {
            return ((T) service
                    .getConstructor(parameterTypesConstructors)
                    .newInstance());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RestClientException(e.getMessage(), e);
        }
    }

    @Override
    public RestClientHost getHost() {
        return host;
    }
}
