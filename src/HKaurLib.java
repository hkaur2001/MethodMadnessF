public class HKaurLib {
    public static boolean isPalindrome(String ) {
        int r, sum = 0, temp;
        temp = n;
        while (n > 0) {
            r = n % 10;  //gets remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            return true;
        else
        return false;
    }

    //public static String stringUnion(String word1, String word2, String word3)


    public static String quadSolver(Double a, Double b, Double c) {
        if (Math.pow(b, 2) - 4 * a * c > 0) {
            return ("The roots of the quadratic equation are real and unequal");
        } else {
            if (Math.pow(b, 2) - 4 * a * c < 0) {
                return ("The roots of the quadratic equation are unequal and not real.  These values are imaginary because they result in a negative value under the square root when calculating the discriminant");
            } else if (Math.pow(b, 2) - 4 * a * c == 0) {
                return ("The roots of the quadratic equation are real and equal");
            }
        }
        return null;
    }
}