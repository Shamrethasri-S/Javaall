public class Fibo
{    public static void main(String [] args)
    {
        int a, b, temp, n;
        a = 0;
        b = 2;
        for (n = 1; n<=10; n++)
   {
System.out.println(a);
            temp = a + b;
            a = b;
            b = temp;
        }
    }
}
 