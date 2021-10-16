package pl.targosz.homework.Lesson7Task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

class WorkerPaymentCalcTest {
    @Test
    void shouldReturnWholePaymentWithoutBonus() {
        BaseSalary baseSalary = Mockito.mock(BaseSalary.class);
        HowManySaturdays howManySaturdays = Mockito.mock(HowManySaturdays.class);
        when(baseSalary.get()).thenReturn(4000);
        when(howManySaturdays.get()).thenReturn(5);

        WorkerPaymentCalc workerPaymentCalc = new WorkerPaymentCalc(baseSalary, howManySaturdays);

        Assertions.assertEquals(9000, workerPaymentCalc.calculate(0));
    }

    @Test
    void shouldReturnWholePaymentWithBonus() {
        BaseSalary baseSalary = Mockito.mock(BaseSalary.class);
        HowManySaturdays howManySaturdays = Mockito.mock(HowManySaturdays.class);
        when(baseSalary.get()).thenReturn(4000);
        when(howManySaturdays.get()).thenReturn(5);

        WorkerPaymentCalc workerPaymentCalc = new WorkerPaymentCalc(baseSalary, howManySaturdays);

        Assertions.assertEquals(9500, workerPaymentCalc.calculate(500));
    }

}