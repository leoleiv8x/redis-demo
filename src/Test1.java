import java.util.Base64;
import java.io.UnsupportedEncodingException;

/**
 * Base64
 */
public class Test1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();
        String text = "哈哈哈哈哈哈哈哈哈哈哈去";
        byte[] bytes = text.getBytes("UTF-8");
        //编码
        String s = encoder.encodeToString(bytes);
        System.out.println(s);
        //解码
        System.out.println(new String(decoder.decode(s),"UTF-8"));

    }
 
}

