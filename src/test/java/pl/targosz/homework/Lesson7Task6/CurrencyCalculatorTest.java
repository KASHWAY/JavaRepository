package pl.targosz.homework.Lesson7Task6;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CurrencyCalculatorTest {
    @Test
    void shouldReturnTheSellAmountFromGBPToPLN() {
        CurrencyInterface currencyInterface = Mockito.mock(CurrencyInterface.class);
        when(currencyInterface.buyRate(Currency.EUR)).thenReturn(BigDecimal.valueOf(3));

        CurrencyCalculator currencyCalculator = new CurrencyCalculator(currencyInterface);

        assertEquals(currencyCalculator.buyRateCalculator(BigDecimal.TEN, Currency.EUR), BigDecimal.valueOf(30));
    }
    @Test
    void shouldReturnTheBuyAmountFromEURToPLN() {
        CurrencyInterface currencyInterface = Mockito.mock(CurrencyInterface.class);
        when(currencyInterface.sellRate(Currency.GBP)).thenReturn(BigDecimal.valueOf(5));

        CurrencyCalculator currencyCalculator = new CurrencyCalculator(currencyInterface);

        assertEquals(currencyCalculator.sellRateCalculator(BigDecimal.TEN,Currency.GBP),BigDecimal.valueOf(50));

    }
}