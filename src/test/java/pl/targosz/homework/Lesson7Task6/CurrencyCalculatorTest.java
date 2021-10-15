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
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(currencyInterface);

        when(currencyCalculator.sellRateCalculator(BigDecimal.valueOf(135.456),Currency.GBP)).thenReturn(BigDecimal.valueOf(135.456*5.42));

        assertEquals(734.17152,currencyCalculator.sellRateCalculator(BigDecimal.valueOf(135.456),Currency.GBP));
    }
    @Test
    void shouldReturnTheBuyAmountFromEURToPLN() {
        CurrencyInterface currencyInterface = Mockito.mock(CurrencyInterface.class);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(currencyInterface);

        when(currencyCalculator.buyRateCalculator(BigDecimal.valueOf(400),Currency.EUR)).thenReturn(BigDecimal.valueOf(400.100*0.22));


    }
}