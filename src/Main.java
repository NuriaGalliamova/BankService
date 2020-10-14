public class Main {
    public static void main(String[] args) {
        DepositProfitService service = new DepositProfitService();
        int result = service.calculate(5000, 5);
        System.out.println(result);
    }
}
