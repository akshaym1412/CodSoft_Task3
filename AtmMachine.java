public class AtmMachine {
   private static int amount;
   public void deposit(int amt){
       amount+=amt;
       System.out.println("------------------------------------------------------");
       System.out.println("Money successfully deposited in to account 90XXXXXXXX41");
       System.out.println("------------------------------------------------------");
   }
   public  int checkBalanace(){
       return amount;
   }
   public void withdraw(int amt){
       if(amount>=amt){
           amount-=amt;
           System.out.println("------------------------------------------------------");
           System.out.println("Withdraw Successful");
           System.out.println("------------------------------------------------------");
       }
       else{
           System.out.println("Insufficient balance");
           //System.out.println("Withdraw amount should be less than or equal to balance");
       }
    }
}
