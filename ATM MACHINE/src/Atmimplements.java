import java.util.HashMap;
import java.util.Map;

public class Atmimplements extends AtmInterf {

    ATM atm = new ATM();
    Map<Double, String> stmt = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available balance is : " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0) {
            if (withdrawAmount <= atm.getBalance()) {
                stmt.put(withdrawAmount, "Withdrawn Amount ");
                System.out.println("collect the cash" + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient balance !!!!");
            }
        } else {
            System.out.println("please enter the amount in multiple of 500");
        }
    }


    @Override
    public void depositeAmount(double depositeAmount) {
        stmt.put(depositeAmount,"Amount Deposited");
        System.out.println(depositeAmount+"deposited sucessfully !!");
        atm.setBalance(depositeAmount+atm.getBalance());
        viewBalance();

    }

    @Override
    public void viewminiStatement() {
    for(Map.Entry<Double,String> m:stmt.entrySet()){
        System.out.println(m.getKey()+""+m.getValue());

        }
    }
}
