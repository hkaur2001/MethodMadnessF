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

    public static String sumUpTo(int integer) {
            int sum = 0;
            for(int i = 1;i <= integer;i++)
            {
                sum = sum + i;
            }
            System.out.println("The sum Of the numbers from 0 to "+integer+" is " + sum);
        return "";
    }

    public static boolean isPrime(int n){
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static String primePrinter(int num){
        int number = 2;
        int primeCount = 0;

        while(primeCount< num) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                primeCount++;
            }
            number++;
        }
        return "";
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

    public static String ccipher (String character, int shift){
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int index = alpha.indexOf(character);
        shift = (shift + index)%26;
        character = alpha.substring(shift, shift+1);
        return character;
    }


    public static String vigCipher(String message, String key){
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String encrypt = "";
        key = key.toLowerCase();
        message = message.toLowerCase();

        String k_ey = "";
        int count = 0;
        for (int i=0; i<message.length(); i++)
            if (!(message.substring(i, i + 1).equals(" "))) {
                k_ey = k_ey + key.substring(count%key.length(), (count%key.length()) +1);
                count++;
            } else {
                k_ey = k_ey + " ";
            }
        System.out.println(k_ey);

        for (int i = 0; i< message.length(); i++)
         {
             if (!(message.substring(i,i+1).equals(" "))){
                 encrypt = encrypt + ccipher(message.substring(i,i+1),alpha.indexOf(k_ey.substring(i,i+1)));
             }else{
                 encrypt = encrypt + " ";
             }
         }
         return encrypt;
    }
}
