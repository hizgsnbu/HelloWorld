package lianxi3_9;

public class Test1 {
    public static void main(String[] args) {
       int a=5;
       TCL tcl=new TCL("王牌",(byte)32,false);
       tcl.output();

        Hisense hisense=new Hisense("海信",(byte)45,true);
        hisense.output();
    }
}
