package Stream;

import java.util.*;

/**
 * max和min函数的使⽤
 */
public class Test05 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student(32),new
                Student(33),new Student(21),new Student(29),new Student(18));

       // Optional<Student> max = list.stream().max(Comparator.comparingInt(Student::getAge));

        Optional<Student> max = list.stream().max((s1, s2) -> {
            return Integer.compare(s1.getAge(), s2.getAge());
        });
 //Optional<Student> max1 = list.stream().max((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));

        Optional<Student> optional = list.stream().min((s1, s2) -> {
            return Integer.compare(s1.getAge(), s2.getAge());
        });
        System.out.println(optional.get().getAge());
    }
}

class Student{
    private int age;

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
