package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void op_add() {
        Sample sample = new Sample();
        int nombre1 = 2;
        int nombre2 = 3;
        int result = sample.op(Sample.Operation.ADD, nombre1, nombre2);
        Assertions.assertThat(result).as("addition of 2 + 3")
            .isEqualTo(5);
    }

    @Test
    void op_mult() {
        Sample sample = new Sample();
        int nombre1 = 2;
        int nombre2 = 3;
        int result = sample.op(Sample.Operation.MULT, nombre1, nombre2);
        Assertions.assertThat(result).as("multiplication of 2 * 3")
            .isEqualTo(6);
    }

    @Test
    void fact_exception() {
        Sample sample = new Sample();
        int n = -2;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(n));
    }

    @Test
    void fact() {
        Sample sample = new Sample();
        int n = 2;
        int fact = sample.fact(n);
        Assertions.assertThat(fact).as("factorial of 2")
            .isEqualTo(2);
    }

    @Test
    void fact_of_0() {
        Sample sample = new Sample();
        int n = 0;
        int fact = sample.fact(n);
        Assertions.assertThat(fact).as("factorial of 0")
            .isEqualTo(1);
    }
}
