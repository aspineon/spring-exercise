package pl.training.bank.account;

import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

@Repository("accountRepository")
public class HashMapAccountRepository implements AccountRepository {

    private Map<String, Account> accounts = new LinkedHashMap<>();
    private long counter;

    @Override
    public synchronized Account save(Account account) {
        account.setId(++counter);
        accounts.put(account.getNumber(), account);
        return account;
    }

    @Override
    public synchronized Optional<Account> getByNumber(String accountNumber) {
        return Optional.ofNullable(accounts.get(accountNumber));
    }

}
