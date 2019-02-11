package pl.training.bank.account;

import org.springframework.stereotype.Service;

@Service("accountNumberGenerator")
public class IncrementalAccountNumberGenerator implements AccountNumberGenerator {

    @Override
    public String next() {
        return "";
    }

}
