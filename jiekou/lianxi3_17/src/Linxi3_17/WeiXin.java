package Linxi3_17;

public class WeiXin implements ChatTool{
    //新增方法
    void snake(){
        System.out.println("微信摇一摇");
    }
    @Override
    public void login() {
        System.out.println("微博登陆");
    }

    @Override
    public void send() {
        snake();
        System.out.println("微博发送消息");
    }

    @Override
    public void exit() {
        System.out.println("退出微博");
    }
}
