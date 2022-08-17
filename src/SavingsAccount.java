import java.util.Random;
public class SavingsAccount {
    public String accountNumber() {
        Random obj = new Random();
        // long accountNumber = obj.nextLong(100000000000l);
        //System.out.println(number);
        String number = null;
        number = number + obj.nextInt(9);
        Math.random();
        return number;
    }

        String accountNumber;
        String accountHolderName;
        double balance;
        String status;


        public double withdrawl(int withdrawlAmount){
            if(balance > withdrawlAmount){
                balance = balance -  withdrawlAmount;

            }
            return balance;

        }
        public double creditbalance(int amount){
          balance = amount + balance ;
          return balance;


        }
        public String getStatus(){
            if(balance > 100){
                status = "active";

            }
            if(balance < 100){
                status = "inactive";

            }
            return status;

        }
        public void


        getBalance(){
            System.out.println(balance);
        }



}
