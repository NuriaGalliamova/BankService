public class DepositProfitService {

    int calculate(int deposit, int percent) {
        int profit = deposit * percent / 100;
        return profit;
    }

    int percentUsual = 3;
    int percentHigh = 5;
    int percentSpecial = 30;
    int cashbackLimit = 3000;

    int cashbackCalculate(int expencesUsual, int expencesHigh, int expencesSpecial) {
        int cashback = expencesUsual * percentUsual / 100 + expencesHigh * percentHigh / 100 + expencesSpecial * percentSpecial / 100;
        if (cashback > cashbackLimit) {
            return cashbackLimit;
        }
        return cashback;
    }
}
