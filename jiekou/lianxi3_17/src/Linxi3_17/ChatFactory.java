package Linxi3_17;

public class ChatFactory {
   public static ChatTool getTool(int a){
       ChatTool chat=null;
       if(a==0){
           chat=new WeiBo();
       }
       else if(a==1){
           chat=new WeiXin();
       }
       else {
           System.out.println("输入有误");
       }
       return chat;
   }
}
