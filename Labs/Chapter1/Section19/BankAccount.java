package Labs.Chapter1.Section19;

public class BankAccount {
    private String name;
    private double checking;
    private double savings;

    public BankAccount(String newName, double amt1, double amt2) {
        this.name = newName;
        this.checking = amt1;
        this.savings = amt2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChecking() {
        return this.checking;
    }

    public void setChecking(double amt) {
        this.checking = amt;
    }

    public double getSavings() {
        return this.savings;
    }

    public void setSavings(double amt) {
        this.savings = amt;
    }

    public void depositChecking(double amt) {
        if (amt > 0)
            setChecking(this.checking + amt);
    }

    public void depositSavings(double amt) {
        if (amt > 0)
            setSavings(this.savings + amt);
    }

    public void withdrawChecking(double amt) {
        if (this.checking > 0 && amt > 0)
            if (this.checking >= amt)
                this.checking -= amt;
    }

    public void withdrawSavings(double amt) {
        if (this.savings > 0 && amt > 0)
            if (this.savings >= amt)
                this.savings -= amt;
    }

    public void transferToSavings(double amt) {
        if (this.checking > 0 && amt > 0)
            if (this.checking >= amt) {
                this.savings += amt;
                this.checking -= amt;
            }
    }

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