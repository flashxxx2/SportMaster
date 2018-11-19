package ru.itpark;

public class BonusService {


    public int calculateBonus(int purchaseAmount, int totalAmount) { //
        int result = 0;
        int blueCardMax = 15000;
        int getBlueCardMin = 1;
        int silverCardMax = 150000;
        int silverCardMin = 15001;
        int goldCardMin = 150001;
        int onePointCost = 1000;
        int pointBlue = 50;
        int pointSilver = 70;
        int pointGold = 100;
        if (totalAmount >= getBlueCardMin && totalAmount <= blueCardMax) {
            result = purchaseAmount * pointBlue / onePointCost;
        }
        if (totalAmount >= silverCardMin && totalAmount <= silverCardMax) {
            result = purchaseAmount * pointSilver / onePointCost;
        }
        if (totalAmount >= goldCardMin) {
            result = purchaseAmount * pointGold / onePointCost;
        }
        return result;
    }
}

