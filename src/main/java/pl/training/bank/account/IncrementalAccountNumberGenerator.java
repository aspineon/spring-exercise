package pl.training.bank.account;

import org.springframework.stereotype.Service;

@Service
public class IncrementalAccountNumberGenerator implements AccountNumberGenerator {

    private long counter;

    @Override
    public String next() {
        return String.format("%026d", ++counter);
    }

}
