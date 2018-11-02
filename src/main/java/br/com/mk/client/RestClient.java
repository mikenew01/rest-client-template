package br.com.mk.client;

import br.com.mk.core.RestClientHost;
import br.com.mk.core.RestClientTarget;
import br.com.mk.core.RestClientTargetImpl;

import java.net.URL;

public final class RestClient {

    private RestClient() {
    }

    public static RestClient newClient() {
        return new RestClient();
    }

    public RestClientTarget target(final String host) {
        RestClientTarget restClientTarget = new RestClientTargetImpl();
        restClientTarget.host(new RestClientHost(host));
        return restClientTarget;
    }

    public RestClientTarget target(final URL url) {
        return target(url.getHost());
    }

    public RestClientTarget target(final RestClientHost host) {
        return target(host.getUrl());
    }
}
