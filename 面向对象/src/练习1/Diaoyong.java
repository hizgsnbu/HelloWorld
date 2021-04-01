package 练习1;

public class Diaoyong {
    public static void main(String[] args) {
        练习1 p1=new 练习1();
        p1.setPingpai("huawei");
        p1.setPrice(9999);
        p1.setColor("红，黄，蓝");
        System.out.println("p1对象的属性为："+p1.getBrand()+"\t"
                +p1.getPrice()+"\t"
                +p1.getColor());
        p1.call();
        p1.paizhao();
        }
    }
