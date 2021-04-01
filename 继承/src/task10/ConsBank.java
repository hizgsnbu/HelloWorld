package task10;

/**
 * @author: pyt
 * @date: 3/21/0021 19:36
 * @description：
 */
public class ConsBank extends Bank{
    double year;   //year=5.236，表示5年零236天

    ConsBank(){

    }
    ConsBank(int money,double rate,double year){
		 //调用父类的2个参数的构造方法
        super(money,rate);
        this.year=year;
    }

    public double compuInterest(){   //重写方法（整年计算按照父类一样，天数计算特殊）

		 //得到year的整数，并赋值给父类变量year
        super.year=(int)year;
        double r=this.year-super.year;  //子类变量year的小数部分赋值给r
        int day=(int)(r*1000)+1;  //还原成天数

        // 计算整数年的利息，按照父类方法即可
        double yearInterest=super.compuInterest();  //调用隐藏的compuInterest()方法

        //计算天数的利息，子类按照自己的规则计算
        double dayInterest=day*0.0001*money;
        interest=yearInterest+dayInterest;  //利息计算完毕
        System.out.println(money+"元钱存在建设银行，"+super.year+"年"+day+"天，利息是："+interest+"元");
        return interest;
    }

}
