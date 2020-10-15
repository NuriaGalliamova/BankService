public class Main {
    public static void main(String[] args) {

        BankService service = new BankService();
        int result1 = service.profitCalculate(5000, 5);
        System.out.println(result1);
        int result2 = service.cashbackCalculate(10000, 15000, 20000);
        System.out.println(result2);

    }

// код не работает, но я не знаю, в чем тут ошибка
