package lianxi3_8;

public class VIPUniversuty extends University {
 @Override
 void enter(){
     if(math+english+chinese+sport>=290){
         double sum;
         sum=math+english+chinese+sport;
         System.out.println("恭喜！4门课总分为"+sum+"，达到重点大学录取线");
     }else {
         System.out.println("您未被重点大学录取");
     }
 }
    }
