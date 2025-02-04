public class Phonepay extends Payment{

    @Override
    void paymentdone()
    {
        System.out.println("Payment done by phonepe");
    }
    void deposit()
    {
        System.out.println("Amount Deposit using phonepe");
    }
    void withdraw()
    {
        System.out.println("Amount withdrawn from phonepe");
    }
}
