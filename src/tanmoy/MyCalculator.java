package tanmoy;

import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic{

    @Override
    public int divisorSum(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                total += i;
            }
        }
        return total;
    }

    @Override
    public BigInteger findFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= n; i++)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

     /*
     Name: Tanjil Ahmed Tanmoy
     ID: 2012020186
     Section: D
     Email: cse_2012020186@lus.ac.bd
     Date: 16-10-2021

    */
}
