package 封装;

/**
 * @author Administrator
 测试类：创建Ｐｅｒｓｏｎ对象，调用对象的方法
 */
public class PersonDamo {
    public static void main(String[] args) {
        //创建Ｐｅｒｓｏｎ类对象Ｐ１
        Person p1=new Person();
        //调用对象的属性和方法
        p1.name="pyt";
        p1.age=25;
        p1.eat();
        p1.speak();
        p1.hobby();

    }
}
