package pl.targosz.homework.Lesson7Task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WorkerPaymentCalcTest {
    @Test
    void shouldReturnWholePayment() {
        BaseSalary baseSalary = Mockito.mock(BaseSalary.class);
        SaturdayBonus saturdayBonus = Mockito.mock(SaturdayBonus.class);
        HowManySaturdays howManySaturdays = Mockito.mock(HowManySaturdays.class);

        WorkerPaymentCalc workerPaymentCalc = new WorkerPaymentCalc(baseSalary,500,saturdayBonus,howManySaturdays);

        Assertions.assertEquals(12500,workerPaymentCalc.paymentCalculator(baseSalary,500,saturdayBonus,howManySaturdays));

    }

}