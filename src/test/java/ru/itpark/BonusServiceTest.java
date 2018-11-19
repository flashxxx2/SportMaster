package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateBonus() {
        {
            BonusService bonusService = new BonusService();
            int bonus = bonusService.calculateBonus(1000, 0);
            assertEquals(0, bonus);
        }
        {
            BonusService bonusService = new BonusService();
            int bonus = bonusService.calculateBonus(1000, 5);
            assertEquals(50, bonus);
        }
        {
            BonusService bonusService = new BonusService();
            int bonus = bonusService.calculateBonus(1000, 15005);
            assertEquals(70, bonus);
        }
        {
            BonusService bonusService = new BonusService();
            int bonus = bonusService.calculateBonus(1000, 150005);
            assertEquals(100, bonus);
        }
    }
}