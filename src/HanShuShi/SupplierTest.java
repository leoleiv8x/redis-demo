package HanShuShi;

import java.util.function.Supplier;

/**
 * Supplier: 供给型接⼝：⽆⼊参，有返回值
 * T：出参类型；没有⼊参
 * 调⽤⽅法：T get();
 */
public class SupplierTest {
    public static void main(String[] args) {
        //Student student = new Student();
        Student student = newStudent();
        System.out.println(student.getName());

    }
    public static Student newStudent(){
        //Supplier<Student> supplier = new Supplier<Student>() {
        //    @Override
        //    public Student get() {
        //       Student student = new Student();
        //       student.setName("默认名称");
        //       return student;
        //    }
        //}
        Supplier<Student> supplier = ()-> {
            Student student = new Student();
            student.setName("默认名称");
            return student;
        };
        return supplier.get();
    }
}


class Student{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
