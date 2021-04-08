import java.util.Scanner;

public class ThrowsTest {
    public static void main(String[] args) {
        System.out.println("请输入被除数");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("请输入除数");
        int b=scanner.nextInt();
        //调用方法完成除法,一种是用户主动加try catch
        //另一种：强制用户必须加try catch
        int result= 0;
        try {
            result = Divide.myDivide(a,b);
            System.out.println("结果是"+result);
        } catch (Exception e) {
            System.out.println("异常是"+e.getMessage());
        }finally {
            System.out.println("可写可不写，都会执行");
        }
        //使用自定义的异常方法
        try{
            result=Divide.myDivide(a,b);
            System.out.println("结果是："+result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
