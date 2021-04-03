/**
 * @author: pyt
 * @date: 3/21/0021 19:37
 * @description：
 */
public class WZBank extends Bank{
    double year;  //year=5.216，表示5年零216天

    WZBank(){

    }

    WZBank(int money,double rate,double year){
		//[代码5] //调用父类的2个参数的构造方法
        this.rate=rate;
        this.money=money;
        this.year=year;
    }

    public double compuInterest(){   //重写方法（整年计算按照父类一样，天数计算特殊）

		//[代码6]  //得到year的整数，并赋值给父类变量year
        double r=this.year-(int)this.year;  //子类变量year的小数部分赋值给r
        int day=(int)(r*1000)+1;  //还原成天数

        // 计算整数年的利息，按照父类方法即可
        double yearInterest=super.compuInterest();  //调用隐藏的compuInterest()方法

        //计算天数的利息，子类按照自己的规则计算
        double dayInterest=day*0.0002*money;
        interest=yearInterest+dayInterest;  //利息计算完毕
        System.out.println(money+"元钱存在温州银行，"+super.year+"年"+day+"天，利息是："+interest+"元");
        return interest;
    }

}
