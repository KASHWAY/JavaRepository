package pl.targosz.homework.Lesson7Task6;


import java.math.BigDecimal;

public interface CurrencyInterface {
    BigDecimal buyRate(Currency currency);

    BigDecimal sellRate(Currency currency);
}
