public class ATM {
    private double balance;
    private double withdrawAmount;
    private double depositeAmount;

     public ATM(){
     }

    public ATM(double balance, double withdrawAmount, double depositeAmount) {
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
        this.depositeAmount = depositeAmount;
    }
    public double getBalance(){
         return balance;
    }
    public void  setBalance(double balance){
         this.balance=balance;

    }
    public double getWithdrawAmount(){
         return withdrawAmount;
    }
    public void setWithdrawAmount(double withdrawAmount){
         this.withdrawAmount=withdrawAmount;
    }
    public double getDepositeAmount(){
         return depositeAmount;
    }
    public void setDepositeAmount(double depositeAmount){
         this.depositeAmount=depositeAmount;
    }


}
