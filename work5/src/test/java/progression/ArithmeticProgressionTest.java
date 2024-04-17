package progression;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticProgressionTest {

    @org.junit.jupiter.api.Test
    void iTerm() {
        ArithmeticProgression arithmeticProgression = new ArithmeticProgression(1,1);
        assertEquals(arithmeticProgression.iTerm(3),4);
    }

    @org.junit.jupiter.api.Test
    void sum() {
        ArithmeticProgression arithmeticProgression = new ArithmeticProgression(1,1);
        assertEquals(arithmeticProgression.sum(3),10);
    }

    @org.junit.jupiter.api.Test
    void iTermException() throws ArithmeticException{
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            ArithmeticProgression arithmeticProgression = new ArithmeticProgression(1,1);
            double x = arithmeticProgression.iTerm(-2);
        });
        assertNotNull(thrown.getMessage());
    }

    @org.junit.jupiter.api.Test
    void sumException() throws ArithmeticException{
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            ArithmeticProgression arithmeticProgression = new ArithmeticProgression(1,1);
            double x = arithmeticProgression.sum(-2);
        });
        assertNotNull(thrown.getMessage());
    }
}