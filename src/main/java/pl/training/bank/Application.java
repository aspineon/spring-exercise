package pl.training.bank;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.training.bank.account.Account;
import pl.training.bank.account.AccountService;

@ComponentScan(basePackages = "pl.training.bank")
@EnableAspectJAutoProxy
public class Application {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class)) {
            AccountService accountService = applicationContext.getBean(AccountService.class);
            Account account = accountService.create();
            System.out.print(account);
        }
    }

}
