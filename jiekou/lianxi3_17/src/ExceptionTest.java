import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("请输入一个除数");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        //提高代码的健壮性
        /*
        * try：可能会出现的异常代码
        * catch:对异常处理的代码
        * finally:不管是否出现异常，都要执行的代码
        * */
        try{
            int result=4/a;
            System.out.println("结果是"+result);
        }catch (Exception e){
            System.out.println("出现异常："+e.getMessage());
        }finally {
            System.out.println("都要执行的代码");
        }
        //编译运行时会出错
       // int result=4/0;
        System.out.println();
    }
}
