package pl.training.bank.account;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    @NonNull
    private AccountNumberGenerator accountNumberGenerator;
    @NonNull
    private AccountRepository accountRepository;

    public Account create() {
        String accountNumber = accountNumberGenerator.next();
        Account account = new Account(accountNumber);
        return accountRepository.save(account);
    }

}
