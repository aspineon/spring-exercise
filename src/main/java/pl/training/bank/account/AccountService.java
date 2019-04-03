package pl.training.bank.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private AccountNumberGenerator accountNumberGenerator;
    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountNumberGenerator accountNumberGenerator, AccountRepository accountRepository) {
        this.accountNumberGenerator = accountNumberGenerator;
        this.accountRepository = accountRepository;
    }

    public Account create() {
        String accountNumber = accountNumberGenerator.next();
        Account account = new Account(accountNumber);
        return accountRepository.save(account);
    }

}
