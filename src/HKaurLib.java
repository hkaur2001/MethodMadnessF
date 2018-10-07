public class HKaurLib {
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        String first = str.substring(0, 1);
        String last = str.substring(str.length() - 1);
        return first.equals(last)
                && isPalindrome(str.substring(1, str.length() - 1));
    }

    public static String dateStr(String date){
        String day = date.substring(3,5);
        String month = date.substring(0,2);
        String year = date.substring(6);
        String Date = day + "-"+ month+ "-"+ year;
        return Date;
    }


    public static int leastCommonMultiple(int num1, int num2, int num3){
        int i = 1;
        while((i%num1!=0)||(i%num2!=0)||(i%num3!=0)){
            i++;
        }
        return i;
    }

    public static int sumUpTo(int n) {
        int result = 0;
        for (int x = 1; x <= n; x++) {
            result += sumUpTo(n);
        }
        return result;
    }


    public static String quadSolver(Double a, Double b, Double c) {
        if (Math.pow(b, 2) - 4 * a * c > 0) {
            double x1;
            x1 = Math.sqrt((b*b)-4*a*c);
            x1 = -b+x1;
            x1 = x1/(2*a);

            double x2;
            x2 = Math.sqrt((b*b)-4*a*c);
            x2 = -b-x2;
            x2 = x2/(2*a);

            System.out.println("The roots are x =  " + x1 + " and " + x2);
            return ("The roots of the quadratic equation are real and unequal");
        } else {
            if (Math.pow(b, 2) - 4 * a * c < 0) {
                return ("The roots of the quadratic equation are unequal and not real.  These values are imaginary because they result in a negative value under the square root when calculating the discriminant");
            } else if (Math.pow(b, 2) - 4 * a * c == 0) {
                double x3;
                x3 = Math.sqrt((b*b)-4*a*c);
                x3 = -b+x3;
                x3 = x3/(2*a);
                System.out.println("The root of the equation is x = " + x3);
                return ("The roots of the quadratic equation are real and equal");
            }
        }
        return null;
    }
}