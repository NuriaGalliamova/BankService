public class BankService {

    int cashbackCalculate(int expencesUsual, int expencesHigh, int expencesSpecial) {
        int percentUsual = 3;
        int percentHigh = 5;
        int percentSpecial = 30;
        int cashbackLimit = 3000;
        int cashback = (expencesUsual * percentUsual + expencesHigh * percentHigh + expencesSpecial * percentSpecial) / 100;
        if (cashback > cashbackLimit) {
            return cashbackLimit;
        }
        return cashback;
    }

    int profitCalculate(int deposit, int percent) {
        int profit = deposit * percent / 100;
        return profit;
    }
}
