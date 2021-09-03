import com.sun.jdi.PathSearchingVirtualMachine;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author yinletian
 * @date 2021/7/14
 */
public class A2222222 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        int week_index1 = cal.get(Calendar.DAY_OF_WEEK) - 1;
        cal.add(Calendar.DATE, -week_index1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s =  sdf.format(cal.getTime());
        System.out.println(s);
        Map<String,String> map = new HashMap<>();
        map.put(s,sdf.format(new Date()));
        for(int i=0;i<6;i++){
            Date parse = null;
            try {
                parse = sdf.parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            cal.setTime(parse);
            cal.add(Calendar.DATE,-7);
            String format = sdf.format(cal.getTime());
            map.put(format,s);
            s = format;
        }

        //map.put("1",map.get(s));
        map.put("1",s);
        for (Map.Entry<String, String> m : map.entrySet()) {
            System.out.println("key:" + m.getKey() + " value:" + m.getValue());
        }
        //System.out.println("最短日期"+map.get(s));
        System.out.println("最短日期"+map.get("1"));
        Collection<String> values = map.values();
        System.out.println(values.toString()); //修改省remove()
        List<String> collect = values.stream().sorted().collect(Collectors.toList());
        List<String> temp = collect;
        temp.remove(0);
        //collect.remove(0);
        System.out.println(collect);


    }
}
