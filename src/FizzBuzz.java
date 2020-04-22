/*
This program prints numbers from 1 to 100
Multiples of 3 will instead print "Fizz"
Multiples of 5 will instead print "Buzz"
Multiples of both 3 and 5 will instead print "FizzBuzz"

Set up a for loop counting from 1 to 100
IF the index is divisible by both 3 and 5 THEN
    Print out FizzBuzz
ELSEIF the index is divisible by 3 THEN
    Print out Fizz
ELSEIF the index is divisible by 5 THEN
    Print out Buzz
ELSE THEN
    Print out the index normally
ENDIF

 */

public class FizzBuzz {
    public static void main (String[] args) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(fizz + buzz);
            } else if (i % 3 == 0) {
                System.out.println(fizz);
            } else if (i % 5 == 0) {
                System.out.println(buzz);
            } else {
                System.out.println(i);
            }
        }
    }
}
