package Linxi3_17;

import java.util.Scanner;

public class ChatTest {
    public static void main(String[] args) {
        System.out.println("请输入0表示微博交流，1表示微信");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        ChatTool chat=ChatFactory.getTool(a);
        chat.login();
        chat.send();
        chat.exit();
    }
}
