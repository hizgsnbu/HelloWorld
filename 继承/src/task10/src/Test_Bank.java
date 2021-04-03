/**
 * @author: pyt
 * @date: 3/21/0021 19:37
 * @description：
 */
public class Test_Bank {
    public static void main(String[] args) {
        //对象bank1是子类Consbank类型，调用构造方法也是子类的
        //所以该对象任何时刻表现出的都是子类
        ConsBank bank1=new ConsBank(8000,0.29,5.236);
        double interest1=bank1.interest;   //调用compuInterest()方法，将结果赋值给interest1
         //多态：继承关系；重写；对象三父类，构造方法是子类
        WZBank bank2=new WZBank(8000,0.29,5.236);
       //调用的三子类重写的方法，（也可以调用父类的方法）
        double interest2=bank2.interest;   //调用compuInterest()方法，将结果赋值给interest2
        double a=interest2-interest1;
        System.out.println("两个银行利息相差："+a);
    }
}
