public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int loanTermMonths = 12;
        int summ = service.calculate(loanTermMonths);
        System.out.println ();
        System.out.println ("1 год");
        System.out.println(summ);

    }

}