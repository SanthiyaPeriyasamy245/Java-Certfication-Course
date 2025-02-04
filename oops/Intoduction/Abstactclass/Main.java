public class Main{
    public static void main(String[] args) {

        Payment gpay=new Gpay();
        gpay.paymentdone();
        Payment paytm=new Paytm();
        paytm.paymentProcess();
        System.out.println(gpay.reciept());

    }
}