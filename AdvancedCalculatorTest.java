@Test
void testPower() {
    assertEquals(8, AdvancedCalculator.power(2, 3));
    assertEquals(0.125, AdvancedCalculator.power(2, -3), 0.0001);
    assertThrows(IllegalArgumentException.class, () -> AdvancedCalculator.power(0, -1));
}
@Test
void testSquareRoot() {
    assertEquals(3, AdvancedCalculator.squareRoot(9), 0.0001);
    assertThrows(IllegalArgumentException.class, () -> AdvancedCalculator.squareRoot(-4));
}
@Test
void testIsPrime() {
    assertTrue(AdvancedCalculator.isPrime(13));
    assertFalse(AdvancedCalculator.isPrime(10));
    assertTrue(AdvancedCalculator.isPrime(29));
    assertFalse(AdvancedCalculator.isPrime(1));
}
@Test
void testFactorial() {
    assertEquals(120, AdvancedCalculator.factorial(5));
    assertEquals(1, AdvancedCalculator.factorial(0));
    assertThrows(IllegalArgumentException.class, () -> AdvancedCalculator.factorial(-3));
    // Optional: Check for 20!
    BigInteger expected = new BigInteger("2432902008176640000");
    assertEquals(expected, AdvancedCalculator.factorial(20));
}
