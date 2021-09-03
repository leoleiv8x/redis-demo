
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/**
 * 时间
 */
public class Test2 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("0000000000000000"+date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        /**
         * LocalDate：不包含具体时间的⽇期。
         * LocalTime：不含⽇期的时间。
         * LocalDateTime：包含了⽇期及时间。
         */
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("11111111  "+ldt);
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format1 = dtf.format(ldt);
        System.out.println(format1);
        System.out.println("====================");

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        System.out.println(dtf1.format(LocalDateTime.now()));
        //DateTimeFormatter.ofPattern("yyyyMMddHHmmss").format(LocalDateTime.now());


    }
}
