public class DepositProfitService {
    int deposit = 5000;
    int percent = 5;

    int calculate(int deposit, int percent) {
        int profit = deposit * percent / 100;
        return profit;
    }
}
