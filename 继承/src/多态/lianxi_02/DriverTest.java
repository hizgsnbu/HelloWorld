package lianxi_02;

public class DriverTest {
    public static void main(String[] args) {
        Driver driver=new Driver();
        Car bmw=new BMW();
        driver.run(bmw);
//        driver.run(qq);
        Benz benz=new Benz();
        driver.run(benz);
        Car audi=new Audi();
        driver.run(audi);
        Car car=new Car();
        driver.run(car);
    }
}
