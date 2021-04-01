package lianxi3_9;

public class TV {
    String brand;
    byte size;
    TV(){}
    //构造方法：有参数，无参数
    TV(String brand,byte size){
        this.brand=brand;
        this.size=size;
    }
    void output(){
        System.out.println("电视机品牌为："+this.brand+",该电视机尺寸为"+this.size);
    }
}
