public class Divide {
  public  static int myDivide(int x,int y)throws Exception{
      //方法加上
      return x/y;
  }
  /*
  * 使用自定义异常
  * */
  public static int myDivide2(int x,int y)throws MyDivideException{
      if (y==0){
          throw new MyDivideException("异常：除数是0");
      }
      return x/y;
  }
}
