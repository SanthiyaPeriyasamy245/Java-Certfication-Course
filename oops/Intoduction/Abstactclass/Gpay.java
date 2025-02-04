public class Gpay  extends Payment{
    @Override
    void paymentdone()
    {
        System.out.println("Payment done by gpay");
    }
    void deposit()
    {
        System.out.println("Amount Deposit using gpay");
    }
    void withdraw()
    {
        System.out.println("Amount withdrawn from gpay");
    }
}
