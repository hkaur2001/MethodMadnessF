public class HKaurLib {
    public static boolean isPrime(int n)
    {
        for (int i = 2; i <n; i++)
        {
            if (n%i == 0)
            {
                return false;
            }
        }
        return true;
    }

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


}


