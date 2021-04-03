package lianxi_03;

public class YuzhouTest {
    public static void main(String[] args) {
    Yuzhou yuzhou=new Yuzhou();
    Diqiu diqiu=new Diqiu();
    Xingqiu xingqiu=new Xingqiu();
    Yueqiu yueqiu=new Yueqiu();
    Yueliang yueliang=new Yueliang();
    yuzhou.star(diqiu);
    yuzhou.star(xingqiu);
    yuzhou.star(yueliang);
    yuzhou.star(yueqiu);
    }
}
