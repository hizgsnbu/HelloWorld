package extendsexamp;

/**
 * @author Administrator
 1.继承:open()  print()  close()
 2.新增：clean()
 3.重写：close()

 */
public class CanonPrinter extends Printer{
    void clean(){
        System.out.println("清除");
    }
    void close(){
        clean();
        System.out.println("关闭");
    }
}
