package 多态.联系１;

public class Cat extends Animal{
    //重写父类的方法

    @Override
    public void speak() {
        System.out.println("Cat:miaomiaomiao");
    }
    //新增方法
    public void skill(){
        System.out.println("catch mouse");
    }
}
