package lianxi3_9;

public class Hisense extends TV {
    boolean d3;
    Hisense(){}
    Hisense(String brand,byte size,boolean d3){
        this.brand=brand;
        this.size=size;
        this.d3=d3;
    }

    @Override
    void output() {
        if(d3){
            System.out.println("牌子："+brand+"，尺寸："+size+
            "，是3D电视");
        }else {
            super.output();
        }
    }
}
