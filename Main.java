//function to check multiple number
public class Main {
    public static void main(String[] args) {
        checkNumbers(10, 25, 30, 15);
        checkEvenOdd(4, 7, 12, 9);
        checkPrimes(2, 4, 7, 15, 19);
    }
    
    // Check if numbers are within range
    static void checkNumbers(int... numbers) {
        System.out.println("Checking numbers:");
        for (int num : numbers) {
            System.out.println(num + " is " + (num > 20 ? "greater than 20" : "20 or less"));
        }
    }
    
    // Check even or odd
    static void checkEvenOdd(int... numbers) {
        System.out.println("\nEven/Odd check:");
        for (int num : numbers) {
            System.out.println(num + " is " + (num % 2 == 0 ? "even" : "odd"));
        }
    }
    
    // Check if prime
    static void checkPrimes(int... numbers) {
        System.out.println("\nPrime check:");
        for (int num : numbers) {
            System.out.println(num + " is " + (isPrime(num) ? "prime" : "not prime"));
        }
    }
    
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}