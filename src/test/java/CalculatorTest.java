import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calkulator = new Calculator();

    @BeforeEach
    void BeforEach()
    {
        System.out.println("Before-Each");
    }

    @Test
    void devideNormalNums() {
        System.out.println("Normal");
        assertEquals(3,calkulator.devide(9,3));
        assertTrue(3>calkulator.devide(4,2));
    }

    @Test
    void devideDecimalNums() {
        System.out.println("Decimal");
        assertEquals(2.5,calkulator.devide(5,2));
        assertEquals(2.5,calkulator.devide(5,2));

    }


    @Test
    void devideDecimalNumsALL() {
        System.out.println("DecimalALL");
        assertAll("heading" , () ->
                assertEquals(3,calkulator.devide(9,3)),
                () -> assertTrue(3>calkulator.devide(4,2)));

    }

    @Test
    void devideNormalThrows() {
        System.out.println("Throws");
        assertThrows(RuntimeException.class, () -> calkulator.devide(2, 0));
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> calkulator.devide(3,0));
        assertTrue(ex.getMessage().contains("Delitel e 0"));
    }

    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "6, 3, 2",
            "4, 2, 2"
    })
    void devideParametrized (double a, double b,double rez)
    {
        assertEquals(rez,calkulator.devide(a,b));
    }
}