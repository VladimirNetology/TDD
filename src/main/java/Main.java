public class Main {
    public static void main(String[] args) {
        Credit credit = new Credit(300000, 5.4, 60);
        System.out.println(credit.calcOverpayment());
        System.out.println(credit.calcMonthlyPayment());
        System.out.println(credit.calcTotalCredit());

    }
}
