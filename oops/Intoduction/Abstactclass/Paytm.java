public class Paytm extends Payment {
    @Override
    void paymentdone()
    {
        System.out.println("Payment done by paytm");
    }
    void deposit()
    {
        System.out.println("Amount Deposit using paytm");
    }
    void withdraw()
    {
        System.out.println("Amount withdrawn from paytm");
    }
}
