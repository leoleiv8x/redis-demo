import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author yinletian
 * @date 2021/7/14
 */
public class Aaaa {
    public static void main(String[] args) throws ParseException {
        //Calendar c = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat  =  new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse("2021-07-18");
        //c.setTime(parse);
        //int week_index00 = c.get(Calendar.DAY_OF_WEEK) -1;
        //System.out.println(week_index00);


        //String[] weeks = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        //获取当前时间
        ////System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        //int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;
        //if(week_index<0){
        //    week_index = 0;
        //}
        ////判断是
        //System.out.println(weeks[week_index]);
        System.out.println("///////////////////////////////");


        Calendar cal = Calendar.getInstance();
        int week_index1 = cal.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println("一周的第几天   "+week_index1);
        Calendar ca2 = Calendar.getInstance();
        ca2.add(Calendar.DATE, -week_index1);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        String s =  simpleDateFormat1.format(ca2.getTime()); //周日时间
        //统计图显示各周日节点 判断的话 大于这个周日 小于等于下个周日
        System.out.println(s.toString());
        //存取个时间节点
        Map<String,String> map = new HashMap<>();
        map.put(s,simpleDateFormat1.format(new Date()));
        //String s1 = map.keySet().iterator().next();
        //是否周日 如果是 -7循环
        //该时间点为周日 周日为第一天
       //if( week_index1 != 0){
           for(int i=0;i<6;i++){
               System.out.println("第"+i+"次"+s);
               Date parse1 = simpleDateFormat1.parse(s);
               Calendar calendar = Calendar.getInstance();
               calendar.setTime(parse1);
               calendar.add(Calendar.DATE,-7);
               String format = simpleDateFormat1.format(calendar.getTime());
               map.put(format,s);
               s = format;
           }
    //   }
        System.out.println(map.size());


        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.println("key:" + m.getKey() + " value:" + m.getValue());
        }
        System.out.println("最短日期"+s);

        //如果不是 当前是时间 到周日 是一个节点 此后循环

    }
}