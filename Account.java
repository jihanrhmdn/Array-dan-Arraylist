public class Account {
    private double balance;

    public Account(double init_balance) {
        balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    // setor uang, hanya valid jika jumlah > 0
    public boolean deposit(double amt) {
        if (amt > 0) {
            balance = balance + amt;
            return true;
        } else {
            return false;
        }
    }

    // tarik uang, hanya valid jika saldo cukup
    public boolean withdraw(double amt) {
        if (balance >= amt) {
            balance = balance - amt;
            return true;
        } else {
            return false;
        }
    }
}