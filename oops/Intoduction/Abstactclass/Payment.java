public abstract class Payment {
private String message="Geth the reciept of your transaction";
    public String reciept()
    {
        return message;
    }
  public void paymentProcess(){
        paymentdone();
        deposit();
        withdraw();
    }
    abstract void paymentdone();
    abstract void deposit();
    abstract void withdraw();
}
