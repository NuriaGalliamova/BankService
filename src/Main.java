public class Main {
    public static void main(String[] args) {

        BankService profit = new BankService();
        int result1 = profit.profitCalculate(5000, 5);
        System.out.println(result1);

        BankService cashback = new BankService();
        int result2 = cashback.cashbackCalculate(10000, 15000, 20000);
        System.out.println(result2);

    }
}

