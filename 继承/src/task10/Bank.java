package task10;

/**
 * @author: pyt
 * @date: 3/21/0021 19:34
 * @description：
 */
public class Bank {
    int money;  //钱
    int year;   //年限
    double interest;   //利息
    double rate;  //利率

    Bank(){

    }

    Bank(int money,double rate){ //构造方法
        this.money=money;
        this.rate=rate;
    }

    public double compuInterest(){   //计算利息并返回，按整年计算
        interest=year*rate*money;
        return interest;
    }

    public void setInterRate(double rate){   //设置利率
        this.rate=rate;
    }
}

