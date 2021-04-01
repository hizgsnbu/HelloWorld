package extendsexamp;

public class PrinterTest {
    public static void main(String[] args) {
HPPrinter hp=new HPPrinter();
hp.open();
hp.print();
hp.close();
CanonPrinter canonPrinter=new CanonPrinter();
canonPrinter.open();
canonPrinter.print();
canonPrinter.close();
    }
}
