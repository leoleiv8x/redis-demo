import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yinletian
 * @date 2021/7/14
 */
public class Ylt {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date parse = sdf.parse("2021-05");
        Date p1 = sdf.parse("2021-07");
        if(parse.getTime() < sdf.parse("2021-056-11").getTime() ){
            System.out.println("11111111111111111111111111");
        }

     }
}
