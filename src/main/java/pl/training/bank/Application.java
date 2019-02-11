package pl.training.bank;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.training.bank.account.Account;
import pl.training.bank.account.AccountService;

public class Application {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("pl.training.bank")) {
            AccountService accountService = null;
            Account account = accountService.create();
            System.out.print(account);
        }
    }

}
