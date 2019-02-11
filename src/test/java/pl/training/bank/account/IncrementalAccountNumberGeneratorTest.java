package pl.training.bank.account;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IncrementalAccountNumberGeneratorTest {

    private static final String ACCOUNT_NUMBER_FORMAT = "\\d{26}";

    private IncrementalAccountNumberGenerator accountNumberGenerator = new IncrementalAccountNumberGenerator();

    @Test
    public void shouldGenerateValidAccountNumber() {
        assertTrue(accountNumberGenerator.next().matches(ACCOUNT_NUMBER_FORMAT));
    }

    @Test
    public void shouldGenerateNewAccountNumberIncreasingPreviousOne() {
        String initialAccountNumber = accountNumberGenerator.next();
        assertEquals(Long.parseLong(initialAccountNumber) + 1, Long.parseLong(accountNumberGenerator.next()));
    }

}