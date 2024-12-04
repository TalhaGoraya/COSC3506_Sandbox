public class AdvancedCalculatorUnitTest {

    AdvancedCalculator calculator = new AdvancedCalculator();

    // Test for the power method, ISSUES: The test calculator.power(0, -1) is not throwing the expected ArithmeticException. 
    public void testPower() {
        System.out.println("Running testPower()");

        double result = calculator.power(2, 3);
        if (result == 8) {
            System.out.println("testPower passed: 2^3 = 8");
        } else {
            System.out.println("testPower failed: 2^3 = " + result);
        }

        result = calculator.power(2, -3);
        if (result == 0.125) {
            System.out.println("testPower passed: 2^-3 = 0.125");
        } else {
            System.out.println("testPower failed: 2^-3 = " + result);
        }

        //should throw exception
        try {
            calculator.power(0, -1);
            System.out.println("testPower failed: Expected ArithmeticException not thrown.");
        } catch (ArithmeticException e) {
            System.out.println("testPower passed: Caught expected exception.");
        }
    }

    // Test for the squareRoot method
    public void testSquareRoot() {
        System.out.println("Running testSquareRoot()");

        double result = calculator.squareRoot(9);
        if (result == 3) {
            System.out.println("testSquareRoot passed: sqrt(9) = 3");
        } else {
            System.out.println("testSquareRoot failed: sqrt(9) = " + result);
        }

        // should throw exception
        try {
            calculator.squareRoot(-4);
            System.out.println("testSquareRoot failed: Expected IllegalArgumentException not thrown.");
        } catch (IllegalArgumentException e) {
            System.out.println("testSquareRoot passed: Caught expected exception.");
        }
    }

    //Test for the isPrime method
    public void testIsPrime() {
        System.out.println("Running testIsPrime()");

        if (calculator.isPrime(13)) {
            System.out.println("testIsPrime passed: 13 is prime.");
        } else {
            System.out.println("testIsPrime failed: 13 is prime.");
        }

        if (!calculator.isPrime(10)) {
            System.out.println("testIsPrime passed: 10 is not prime.");
        } else {
            System.out.println("testIsPrime failed: 10 is not prime.");
        }

        if (calculator.isPrime(29)) {
            System.out.println("testIsPrime passed: 29 is prime.");
        } else {
            System.out.println("testIsPrime failed: 29 is prime.");
        }

        if (!calculator.isPrime(1)) {
            System.out.println("testIsPrime passed: 1 is not prime.");
        } else {
            System.out.println("testIsPrime failed: 1 is not prime.");
        }
    }

    // Test for the factorial method, ISSUE: The factorial of 20 is returning a negative number: -2102132736, which is incorrect. The factorial of 20 is 2432902008176640000, which is much larger than what an int can store.
    public void testFactorial() {
        System.out.println("Running testFactorial()");

        long result = calculator.factorial(5);
        if (result == 120) {
            System.out.println("testFactorial passed: 5! = 120");
        } else {
            System.out.println("testFactorial failed: 5! = " + result);
        }

        //should be 1
        result = calculator.factorial(0);
        if (result == 1) {
            System.out.println("testFactorial passed: 0! = 1");
        } else {
            System.out.println("testFactorial failed: 0! = " + result);
        }

        //should throw exception
        try {
            calculator.factorial(-3);
            System.out.println("testFactorial failed: Expected IllegalArgumentException not thrown.");
        } catch (IllegalArgumentException e) {
            System.out.println("testFactorial passed: Caught expected exception.");
        }

        long result20 = calculator.factorial(20);
        long expectedFactorial20 = 2432902008176640000L;
        if (result20 == expectedFactorial20) {
            System.out.println("testFactorial passed: 20! = " + expectedFactorial20);
        } else {
            System.out.println("testFactorial failed: 20! = " + result20);
        }
    }

    // Main method to run the tests
    public static void main(String[] args) {
        AdvancedCalculatorUnitTest tester = new AdvancedCalculatorUnitTest();
        tester.testPower();
        tester.testSquareRoot();
        tester.testIsPrime();
        tester.testFactorial();
    }
}
