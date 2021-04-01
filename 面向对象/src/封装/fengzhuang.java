package 封装;

public class fengzhuang {
    //封装:1
       private  String name;
       private int age;
       void setName(String name1){
           name=name1;
       }
           String getName() {
       return name;
       }
       void setAge(int age1) {
       if(age1<0){
           System.out.println("年龄设置有误，不能为负数");
       } else if(age1>150){
               System.out.println("年龄不能超过１５０，请重新设置");
           }else{
    age=age1;
           }
       }
       void eat(){
            System.out.println(name+"喜欢吃饭");
        }
        void speak(){
            System.out.println(name+"喜欢说话");
        }
        void hobby(){
            System.out.println(name+"喜欢打代码");
        }

    public int getAge() {
        return age;
    }
}


