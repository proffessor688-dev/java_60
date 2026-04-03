import java.util.*;

class MathsUtils {
    public static boolean Prime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // not prime
            }
        }
        return true; // prime
    }
}

public class CheckPrime {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value :");
        int num = input.nextInt();

        boolean result = MathsUtils.Prime(num);
        System.out.println(result);
    }
}