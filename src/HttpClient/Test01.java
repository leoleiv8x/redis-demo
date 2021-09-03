package HttpClient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * JDK11新特性
 * HttpClient get
 */
public class Test01 {
    public static void main(String[] args) {

        String text = "xdclass.net";
        //String类新增repeat(int num) ⽅法，⽤于字符串循环输出
        System.out.println(text.repeat(2));
        test();
    }
    private static final String targetUrl = "https://api.xdclass.net/pub/api/v1/web/img_configs?types=pc-home-bottom-float,pc-nav-1,pc-nav-2,pc-home-top,pc-home-bottom-float,pc-home-right";
    private static final URI uri = URI.create(targetUrl);

    private static void test(){
        //创建http客户端
        //HttpClient httpClient = HttpClient.newHttpClient();
        var build = HttpClient.newBuilder().connectTimeout(Duration.ofMillis(5000)).build();
        //创建请求
        var build1 = HttpRequest.newBuilder().timeout(Duration.ofMillis(3000))
                .header("key1", "v1")
                .header("key2", "v2")
                .uri(uri).build();

        try {
            var send1 = build.send(build1, HttpResponse.BodyHandlers.ofString());
            System.out.println(send1);
            System.out.println(send1.body());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
