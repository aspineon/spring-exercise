package pl.training.bank.account;

import java.util.Optional;

public interface AccountRepository {

    Account save(Account account);

    Optional<Account> getByNumber(String accountNumber);

}
