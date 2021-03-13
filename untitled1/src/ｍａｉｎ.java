public class　void main ( String[] args){
    int a=298;
    byte b;
//    从大到小　需要强制类型转换
    b=(byte) a;
    System.out.println("a="+a);
//    强制类型转换造成精度丢失
    System.out.println("b="+b);

    byte a1=3;
    byte a2=4;
    byte a3=a1+a2;
    System.out.println("a3="+a3);
}
