import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class CreditCalcTest {
    int creditTotal = 300000;
    double creditApr = 5.4;
    int creditMonths = 60;

    @Test
    public void testCalsOverpayment() {
        Credit credit = new Credit(creditTotal, creditApr, creditMonths);
        int sumOverpayment = credit.calcOverpayment();
        assertTrue("Error sumOverpayment: " + sumOverpayment, 81000);
    }

    @Test
    public void testCalsMonthlyPayment() {
        Credit credit = new Credit(creditTotal, creditApr, creditMonths);
        int sumMonthlyPayment = credit.calcMonthlyPayment();
        assertTrue("Error sumMonthlyPayment: " + sumMonthlyPayment, 1350);
    }

    @Test
    public void testCalsTotalCredit() {
        Credit credit = new Credit(creditTotal, creditApr, creditMonths);
        int sumTotalCredit = credit.calcTotalCredit();
        assertTrue("Error sumTotalCredit: " + sumTotalCredit, 381000);
    }
}
