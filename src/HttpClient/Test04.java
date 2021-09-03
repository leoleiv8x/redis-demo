package HttpClient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * http2 version
 */
public class Test04 {
    public static void main(String[] args) {
        testHttp2();
    }

    private static final String targetUrl = "https://http2.akamai.com/demo";
    private static final URI uri = URI.create(targetUrl);

    private static void testHttp2() {
        var httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofMillis(3000))
                .version(HttpClient.Version.HTTP_2)
                .build();
        var request = HttpRequest.newBuilder()
                .timeout(Duration.ofMillis(3000))
                .header("key1", "v1")
                .header("key2", "v2")
                .uri(uri)
                .build();
        try {
            var response = httpClient.send(request,
                    HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            System.out.println(response.version());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
