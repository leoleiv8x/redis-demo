package HttpClient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * HttpClient post
 */
public class Test02 {
    public static void main(String[] args) {
        testPost();
    }

    private static final String targetUrl ="https://api.xdclass.net/pub/api/v1/web/web_login";
    private static final URI uri = URI.create(targetUrl);

    //POST请求
    private static void testPost() {
        //创建httpclient客户端
        var httpClient = HttpClient.newHttpClient();

        //创建httpclient请求
        var request = HttpRequest.newBuilder().uri(uri)
        //json格式则使⽤下⾯数据
        //.header("Content-Type", "application/json")
        //.POST(HttpRequest.BodyPublishers.ofString("{\"phone\":\"13113777337\",\"pwd\":\"1234567890\"}"))
        // form表单则使⽤下⾯配置
        .header("Content-Type", "application/x-www-formurlencoded")
        .POST(HttpRequest.BodyPublishers.ofString("phone=13113777337&pwd=1234567890"))
        .build();

            try {
                var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());
            } catch (Exception e) {
               e.printStackTrace();
             }
        }
}