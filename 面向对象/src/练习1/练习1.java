package 练习1;

public class 练习1 {
   private String pingpai;
   private int price;
   private String color;
   void setPingpai(String brand){
       pingpai=brand;
   }
   void setPrice(int price1){
       price=price1;
   }
   void setColor(String color1){
       color=color1;
   }
    void paizhao(){
        System.out.println("能拍照");
    }
    void call(){
        System.out.println("打电话");
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return pingpai;
    }

    public String getColor() {
        return color;
    }
}