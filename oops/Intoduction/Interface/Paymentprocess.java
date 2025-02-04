public class Paymentprocess implements Paymentways{

    @Override
    public void gpay() {
        
        System.out.println(("payment done by gpay"));
    }

    @Override
    public void paytm() {
    
        System.out.println(("payment done by paytm"));
    }

    @Override
    public void phonepe() {
        
        System.out.println((" payment done by phonepe'"));
    }
}
