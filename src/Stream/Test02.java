package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * map filter函数
 */
public class Test02 {
    public static void main(String[] args) {
        //
        List<User> userList = Arrays.asList(new User(1,"YINLE","AAAAA"),
                new User(2,"LILIN","ASDASD"), new User(3,"CCCCC","AAAAA"));

        //将流中的每⼀个元素 T 映射为 R（类似类型转换） 对集合的每个对象做处理..
        List<UserDTO> userDTO = userList.stream().map(obj -> {
            UserDTO erDTO = new UserDTO(obj.getId(), obj.getName());
            return erDTO;
        }).collect(Collectors.toList());
        System.out.println(userDTO);

        //filter函数 ⽤于通过设置的条件过滤出元素
        List<User> collect = userList.stream().filter(obj -> obj.getId() > 1).collect(Collectors.toList());
        System.out.println(collect);

    }
}
