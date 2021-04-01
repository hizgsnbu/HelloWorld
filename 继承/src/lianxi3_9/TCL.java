package lianxi3_9;

public class TCL extends TV{
    //新增的属性
    boolean cloud;
    TCL(){}
    TCL(String brand,byte size,boolean cloud){
        this.brand=brand;
        this.size=size;
        this.cloud=cloud;
    }
//重写的父类的方法
    @Override
    void output() {
      if(!cloud){
          super.output();
      }
    else{
        System.out.println("牌子："+brand+"尺寸"+size+",是云电视");
      }
}
}
