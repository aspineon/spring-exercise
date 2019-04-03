package pl.training.bank.account;

import org.springframework.stereotype.Service;

@Service
public class FakelAccountNumberGenerator implements AccountNumberGenerator {

    private static final String ACCOUNT_NUMBER = "00000000000000000000000000";

    @Override
    public String next() {
        return ACCOUNT_NUMBER;
    }

}
