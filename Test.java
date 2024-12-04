import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest{
    private final AdvancedCalculator t1=new AdvancedCalculator();   //Object creation

    @Test
    void testPower(){       //Test for power
        assertEquals(8.0,t1.power(2,3),0.0001);
        assertEquals(0.125,t1.power(2,-3),0.0001);
        assertThrows(ArithmeticException.class,()->t1.power(0,-1));   //Exception Handling
    }
    @Test
    void testSquare(){      //Power for Square Root
        assertEquals(3.0,t1.squareRoot(9),0.0001);
        assertThrows(IllegalArgumentException.class,()->t1.squareRoot(-4));  //Exception Handling
    }

    @Test
    void testPrime(){   //Test for prime
        assertTrue(t1.isPrime(13));
        assertFalse(t1.isPrime(10));
        assertTrue(t1.isPrime(29));
        assertFalse(t1.isPrime(1));
    }
    @Test
    void testFactorial(){       //test for factorial
        assertEquals(120,calculator.factorial(5));
        assertEquals(1,calculator.factorial(0));
        assertThrows(IllegalArgumentException.class,()->calculator.factorial(-3));  //Exception Handling
        assertEquals(2432902008176640000L, calculator.factorial(20));
    }
}