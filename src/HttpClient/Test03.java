package HttpClient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

/**
 * 异步请求get
 */
public class Test03 {
    public static void main(String[] args) {
        testAsynGet();
    }

    //异步GET请求
    private static final String targetUrl ="http://api.xdclass.net/pub/api/v1/web/all_category";
    private static final URI uri = URI.create(targetUrl);

    //异步请求通过CompletableFuture实现。
    private static void testAsynGet() {
        //创建httpClient客户端
        var httpClient = HttpClient.newBuilder().build();
        //创建请求
        var request = HttpRequest.newBuilder().timeout(Duration.ofMillis(3000))
                        .header("key1", "v1")
                        .header("key2", "v2")
                        .uri(uri).build();
        try {

        // CompletableFuture<String> result = httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body);

            var result = httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body);
            System.out.println(result.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
