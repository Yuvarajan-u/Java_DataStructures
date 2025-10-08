package recursion;
/*
     *  return 5 * fac(5-1) 5 * 24 ==> 120 result
     *      return 4 * fac(4-1) => 4 * 6 (previous return 3*2)
     *          return 3 * fac(3-1) => 3*2
     *              return 2 * fac(2-1) => 2*1
     *                  return 1
     *
     * 
     * Call Stack Representation for factorial(5):
     *
     * factorial(5)
     *   |
     *   -> factorial(4)
     *        |
     *        -> factorial(3)
     *             |
     *             -> factorial(2)
     *                  |
     *                  -> factorial(1)
     *
     * The stack unwinds as follows:
     * factorial(1) returns 1
     * factorial(2) returns 2 * 1 = 2
     * factorial(3) returns 3 * 2 = 6
     * factorial(4) returns 4 * 6 = 24
     * factorial(5) returns 5 * 24 = 120
     */

public class Factorial_rec {
    public static int factorial(int n){
        if (n ==1) return 1;

        return n* factorial(n-1);
    }

    
    public static void main(String[] args) {
        factorial(5);
    }
    
}
