package 封装;

public class fengzhuag2 {
    public static void main(String[] args) {
        //创建Ｐｅｒｓｏｎ类对象Ｐ１
        fengzhuang p1=new fengzhuang();
        //调用对象的属性和方法
        //p1.name="pyt";
        p1.setName("pyt");
        String name=p1.getName();
        System.out.println(name);
        p1.setAge(25);
        System.out.println("ｐ１对象的ａｇｅ是"+p1.getAge());
        p1.eat();
        p1.speak();
        p1.hobby();
}
}
