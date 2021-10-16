package pl.targosz.homework.Lesson7Task6;

import java.math.BigDecimal;

public class CurrencyCalculator {
    private final CurrencyInterface currencyInterface;

    public CurrencyCalculator(CurrencyInterface currencyInterface) {
        this.currencyInterface = currencyInterface;
    }

    public BigDecimal sellRateCalculator(BigDecimal amount, Currency currency) {
        BigDecimal sellRate = currencyInterface.sellRate(currency);
        return sellRate.multiply(amount);
    }

    public BigDecimal buyRateCalculator(BigDecimal amount, Currency currency) {
        BigDecimal buyRate = currencyInterface.buyRate(currency);
        return buyRate.multiply(amount);
    }
}
