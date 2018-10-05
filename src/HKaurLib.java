public class HKaurLib {
    public static void isPalindrome(int n)
    {
        int r,sum=0,temp;
        temp=n;
        while(n>0){
            r=n%10;  //gets remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

    public static void (int num1, int num2, int num 3,)  //add the name leastCommonMultiple
    {
    int lcm;

        // maximum number between n1 and n2 is stored in lcm
        if (num1>num2){lcm = num1;
        }else{
            lcm = num2;
        }
        // Always true
        while(true)
        {
            if( lcm % num1 == 0 && lcm % num2 == 0 )
            {
                System.out.printf("The LCM of %d and %d is %d.", num1, num2, lcm);
                break;
            }
            ++lcm;
        }
    }

    public static void quadSolver (Double a, Double b, Double c){
    if (b**2 - 4*a*c > 0){
    return "The roots of the quadratic equation are real and unequal";}
    else{
    if (b**2- 4*a*c<0){
    return "The roots of the quadratic equation are unequal and not real.  These values are imaginary because they result in a negative value under the square root when calculating the discriminant";
    else if (b**2- 4*a*c=0)
    return "The roots of the quadratic equation are real and equal";}
}