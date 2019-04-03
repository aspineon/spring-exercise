package pl.training.bank.account;

public class Account {

    private Long id;
    private String number;
    private long balance;

    public Account(String number) {
        this.number = number;
    }

    public void deposit(long funds) {
        balance += funds;
    }

    public void withdraw(long funds) {
        balance -= funds;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Account(id=" + id + ", number='" + number + ", balance=" + balance + ")";
    }
}
