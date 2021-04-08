package lianxi3_18;

import java.util.Scanner;

public class ComputerTest {
    public static void main(String[] args) {
        //先创建计算机对象
        //2.网对象中添加鼠标，键盘，麦克风设备
        //3.执行计算机开机功能
        //4.再次执行地剪辑关机功能
        Computer computer=new Computer();
        //通过多台方式建立对象
        USB mouse=new Mouse();
        USB keyboard=new KetBoard();
        USB mic=new Mic();
        computer.add(mouse);
        computer.add(keyboard);
        computer.add(mic);
        //执行计算机开机功能
        computer.on();
        //执行计算机关机功能
        computer.off();
    }
}
