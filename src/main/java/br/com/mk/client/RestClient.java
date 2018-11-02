package br.com.mk.client;

import java.lang.reflect.InvocationTargetException;

public class RestClient {

    private final String host;

    private RestClient(final String host) {
        this.host = host;
    }

    public static RestClient newInstance(final String host) {
        return new RestClient(host);
    }

    public <T> T getService(final Class<T> service) {
        try {
            return ((T) service
                    .getConstructor(String.class)
                    .newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return null;
    }

    public <T> T getService(final Class<T> service, final Class<?>... parameterTypesConstructors) {
        try {
            return ((T) service
                    .getConstructor(parameterTypesConstructors)
                    .newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return null;
    }
}
