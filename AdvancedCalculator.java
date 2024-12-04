public class AdvancedCalculator {
    public double power(double base,int exponent){  // Calculates power 
        if(base==0&&exponent<0){
            throw new ArithmeticException("Cannot calculate 0 to the power of a negative number");
        }
        if(exponent<0){    //Negative Number handling
            return 1/Math.pow(base,-exponent);
        }
        return Math.pow(base,exponent);
    }
    public double squareRoot(double number){    //Calcuktes square root
        if(number<0){
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number);
    }
    public boolean isPrime(int number){  //Finds prime
        if(number<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(number);i++){ //Correct implementation to find prime nos
            if (number%i==0) {
                return false;
            }
        }
        return true;
    }
    public long factorial(int number){     //Calculates factorial
        if (number<0){
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        long result=1;
        for(int i=1;i<=number;i++){
            result*=i;
        }
        return result;
    }
}