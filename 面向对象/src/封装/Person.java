package 封装;

/**
 * @author Administrator
 * 类由属性和方法组成：成员变量和成员方法
 * 人类：两个属性：姓名，年龄
 *       两个方法：吃饭，说话
 */
public class Person {
    String name;
    int age;
    void eat(){
        System.out.println(name+"喜欢吃饭");
    }
    void speak(){
        System.out.println(name+"喜欢说话");
    }
    void hobby(){
        System.out.println(name+"喜欢打代码");
    }
}
