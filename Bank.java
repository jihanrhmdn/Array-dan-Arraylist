public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l) {
        customers[numberOfCustomers] = new Customer(f, l);
        numberOfCustomers++;
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }

    public static void main(String[] args) {
        // array Account
        Account[] akun = new Account[2];
        akun[0] = new Account(100);
        akun[1] = new Account(200);

        // uji uang cukup / kurang
        System.out.println("Saldo awal akun 0  : " + akun[0].getBalance());
        System.out.println("Tarik 50           : " + akun[0].withdraw(50) + " (true = berhasil, saldo cukup)");
        System.out.println("Tarik 500          : " + akun[0].withdraw(500) + " (false = gagal, saldo tidak cukup)");
        System.out.println("Saldo akhir akun 0 : " + akun[0].getBalance());

        // uji Customer
        Customer c = new Customer("Joko", "Susilo");
        c.setAccount(akun[0]);
        c.setAccount(akun[1]);
        System.out.println("Nasabah            : " + c.getFirstName() + " punya " + c.getNumOfAccounts() + " akun");

        // uji Bank
        Bank bank = new Bank();
        bank.addCustomer("Joko", "Susilo");
        bank.addCustomer("Susi", "Wulandari");
        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            System.out.println("Daftar nasabah " + (i + 1) + "   : " + bank.getCustomer(i).getFirstName());
        }
    }
}