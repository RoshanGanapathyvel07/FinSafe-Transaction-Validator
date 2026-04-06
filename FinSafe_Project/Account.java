import java.util.ArrayList;

public class Account {
    private int balance;
    private String accountholder;
    private ArrayList<Integer> arr;

    public Account(int balance, String accountholder) {
        this.balance = balance;
        this.accountholder = accountholder;
        this.arr = new ArrayList<>();
    }

    public void setArr(int amount) {
        if (arr.size() == 5) {
            arr.remove(0);
        }
        arr.add(amount);
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount!");
        }
        balance += amount;
        setArr(amount);
    }

    public void processtransaction(int amount) throws InsufficientException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount!");
        } else if (amount > balance) {
            throw new InsufficientException("Insufficient Balance!");
        }
        balance -= amount;
        setArr(-amount);
    }

    public void printstatement() {
        System.out.println("Transaction History:");
        for (Integer i : arr) {
            System.out.println(i);
        }
        System.out.println("Current Balance: " + balance);
    }
}
