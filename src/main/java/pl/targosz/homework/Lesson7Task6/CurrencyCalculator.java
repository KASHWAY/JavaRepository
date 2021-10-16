package pl.targosz.homework.Lesson7Task6;

import java.math.BigDecimal;

public class CurrencyCalculator {
    private static CurrencyInterface currencyInterface;

    public CurrencyCalculator(CurrencyInterface currencyInterface) {
        this.currencyInterface = currencyInterface;
    }

    public BigDecimal sellRateCalculator(BigDecimal PLN, Currency currency) {
        BigDecimal sellRate = currencyInterface.sellRate(currency);
        return sellRate.multiply(PLN);

    }


    public BigDecimal buyRateCalculator(BigDecimal PLN, Currency currency) {
        BigDecimal buyRate = currencyInterface.buyRate(currency);
        return buyRate.multiply(PLN);
    }
}
