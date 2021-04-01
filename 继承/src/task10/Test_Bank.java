package task10;

/**
 * @author: pyt
 * @date: 3/21/0021 19:37
 * @description：
 */
public class Test_Bank {

    public static void main(String[] args) {
        ConsBank bank1=new ConsBank(8000,0.29,5.236);
        double interest1=bank1.interest;   //调用compuInterest()方法，将结果赋值给interest1

        WZBank bank2=new WZBank(8000,0.29,5.236);
        double interest2=bank2.interest;   //调用compuInterest()方法，将结果赋值给interest2
        double a=interest2-interest1;
        System.out.println("两个银行利息相差："+a);
    }
}
