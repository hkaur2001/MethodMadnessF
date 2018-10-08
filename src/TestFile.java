public class TestFile {

    public static void main(String[] args)
    {
        /**
         * the first test print true because it is the same back and forth while the second one is not
         */
        System.out.println((HKaurLib.isPalindrome("eevee")));
        System.out.println((HKaurLib.isPalindrome("race")));
        /**
         * the day is put in front of the month and slashes are replaced with dashes
         */
        System.out.println((HKaurLib.dateStr("10/07/2018")));
        /**
         * prints the first 4 prime numbers 2,3,5, and 7
         */
        System.out.println((HKaurLib.primePrinter(4)));
        /**
         * prints the sum up to the first 10 integers with sum of 55
         */
        System.out.println(HKaurLib.sumUpTo(10));
        /**
         * prints the lcm of 1, 4, and 6
         */
        System.out.println((HKaurLib.leastCommonMultiple(1, 4, 6)));
        /**
         * With discriminant > 2 and using quadratic formula two real and unequal roots were found
         */
        System.out.println(HKaurLib.quadSolver(3.0, 4.0, -4.0));
        /**
         * With no real solutions no roots are returned.  User is informed that roots are imaginary.
         */
        System.out.println(HKaurLib.quadSolver(1.0, 4.0, 5.0));

    }
}
