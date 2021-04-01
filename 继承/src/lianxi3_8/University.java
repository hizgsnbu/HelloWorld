package lianxi3_8;

import java.util.Scanner;

public class University {
    double math;
    double english;
    double chinese;
    double sport;
    void enter(){
        if (math+english+chinese>=180 && sport>=60){
            double x;
            x=math+english+chinese;
            System.out.println("恭喜！3门课总分为："+x+"，且体育达标，达到大学录取线");
        }else {
            System.out.println("您落榜了！");
        }
    }
}
