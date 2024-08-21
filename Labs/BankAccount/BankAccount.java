public class BankAccount {
    // TODO: Build BankAccount class with methods listed above
    
    /* Type your code here. */ 
    
 
    // main
     public static void main(String args[]) {
         BankAccount account = new BankAccount("Mickey", 500.00, 1000.00);
         account.setChecking(500);
         account.setSavings(500);
         account.withdrawSavings(100);
         account.withdrawChecking(100);
         account.transferToSavings(300);
 
         System.out.println(account.getName()); // Expected Mickey
         System.out.printf("$%.2f\n", account.getChecking()); // Expected 100.0
         System.out.printf("$%.2f\n", account.getSavings()); // Expected 700.0
     } 
 }