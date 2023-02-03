public class CreditPaymentService {
    public int calculate(int loanTermMonths) {
       // int loanTermMonths;
        // срок кредита месяцев
        int loan = 1_000_000; // сумма кредита
        double ratePerYear = 9.99; // ставка %% в год
        double ratePerMonth = ratePerYear / 12 / 100; // ставка %% в месяц

        double annuityRate = (ratePerMonth * Math.pow((1 + ratePerMonth), loanTermMonths) / (Math.pow((1 + ratePerMonth), loanTermMonths) - 1));
        //коэффициент ануитета
        double monthlyPayment = annuityRate * loan; // сумма платежа в месяц
        return (int) monthlyPayment;
    }
}