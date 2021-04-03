package 多态.联系１;

public class AnimalTest {
    public static void main(String[] args) {
        //利用多态　创建２个对象
        //多态：引用的三父类，指向子类
        Animal kitty=new Cat();
        Animal bobi=new Dog();
        //调用方法，观察
        //1.调用子类重写的方法
        kitty.speak();
        //2.不能调用子类新增的方法
        //kitty.skill(); //出错
        bobi.speak();
        //3.父类的方法能调用
        kitty.setName("kitty");
        String name=kitty.getName();
        System.out.println(name);
        //多态　如何调用子类的新增的方法？转型
        Cat c=(Cat) kitty;
        c.skill();
    }
}
