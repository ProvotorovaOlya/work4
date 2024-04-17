package progression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometricProgressionTest {

    @Test
    void iTerm() {
        GeometricProgression geometricProgression = new GeometricProgression(2,2);
        assertEquals(geometricProgression.iTerm(3),16);
    }

    @Test
    void sum() {
        GeometricProgression geometricProgression = new GeometricProgression(2,2);
        assertEquals(geometricProgression.sum(2),14);
    }

    @org.junit.jupiter.api.Test
    void iTermException() throws ArithmeticException{
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            GeometricProgression geometricProgression = new GeometricProgression(2,2);
            double x = geometricProgression.iTerm(-3);
        });
        assertNotNull(thrown.getMessage());
    }

    @org.junit.jupiter.api.Test
    void sumException() throws ArithmeticException{
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            GeometricProgression geometricProgression = new GeometricProgression(2,2);
            double x = geometricProgression.sum(-3);
        });
        assertNotNull(thrown.getMessage());
    }
}