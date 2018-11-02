import br.com.mk.client.RestClient;
import br.com.mk.core.RestClientHost;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {

        RestClient.newClient()
                .target(new URL("http://www.google.com.br"))
                .getService(String.class)
                .getBytes();

    }

}
