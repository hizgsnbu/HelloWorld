package Linxi3_17;

public class WeiBo implements ChatTool{
    //新增一个方法
    void fans(){
        System.out.println("微博求粉");
    }
    @Override
    public void login() {
        System.out.println("微博登陆");
    }

    @Override
    public void send() {
        fans();
        System.out.println("微博发送消息");
    }

    @Override
    public void exit() {
        System.out.println("退出微博");
    }
}
