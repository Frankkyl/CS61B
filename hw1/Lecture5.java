/**
 * Created by kysft on 3/21/17.
 */

import java.util.Arrays;
import java.lang.String;

public class Lecture5 {
    //while loops
    public static boolean isPrime(int n) {
        int divisor = 2;//ifn<=2, the loop body wont iterate even once
        while (divisor < n) {
            if (n % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }

    //for loop
    public static boolean isPrime2(int n) {
        for (int divisor = 2; divisor < n; divisor++) {
            if (n % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    //Loop Bounds
    //Print all primes in range 2...n
    public static void printPrimes(int n) {
        int i;
        for (i = 2; i < n; i++) {//so the n is missing for this loop, it should be i<=n
            if (isPrime(i)) {
                System.out.print(" " + i);
            }
        }
    }

    //
    //for (i=0;i<n;i++)
    //    (i=1;i<=n,i++)
    //ARRAYS
    //reference to a array(any length of characters)
    char[] c = new char[4];
    //field "c.length"
    //c.length=7; complie-time ERROR, cause u cant change it once you have the array
    //Primes Revisited
    //Sieve of Eratostenes.

    public static void printPrimes2(int n){
        boolean[] prime = new boolean[n+1];
        for(int i=2;i<=n;i++){
            prime[i]=true;
        }
        for(int divisor=2;divisor*divisor<=n;divisor++){
            if(prime[divisor]){
                for(int i=2*divisor;i<=n;i=i+divisor){
                    prime[i]=false;
                }
            }
        }
        for(int i =2;i<=n;i++){
            if(prime[i]){
                System.out.print(" " + i);
            }
        }

    }
    //multi dimensional arrays
    //two-dimensional array
    //Pascal's Triangle;
    //row i represents coefficients of (x+1)^i
    public static int[][] pascalTriangle(int n){
        int[][] pt=new int[n][];
        for (int i=0;i<n;i++){
            pt[i]=new int[i+1];
            pt[i][0]=1;
            for(int j=1;j<i;j++){
                pt[i][j]=pt[i-1][j-1]+pt[i-1][j];
            }
            pt[i][i]=1;
            System.out.println(Arrays.deepToString(pt));
        }
        return pt;
    }
    //pengding for output by List<Integer>
    public static int[][] pascalTriangle2(int n){
        int[][] pt=new int[n][];
        for (int i=0;i<n;i++){
            pt[i]=new int[n];
            pt[i][0]=1;
            for(int j=1;j<i;j++){
                pt[i][j]=pt[i-1][j-1]+pt[i-1][j];
            }
            pt[i][i]=1;
            System.out.println(Arrays.deepToString(pt));
        }
        return pt;
    }
    public static void main(String[] args){
        Lecture5 l5= new Lecture5();
        //l5.printPrimes2(9);
        l5.pascalTriangle(5);
        l5.pascalTriangle2(5);
    }
}
