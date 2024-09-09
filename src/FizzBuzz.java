/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 0;
        while (i++ < 100) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.

            boolean printed = false;

            while (divisibleBy3 && divisibleBy5 && !printed) {

                System.out.println("Fizz Buzz");
                printed = true;
            }
            while  (divisibleBy3 && !printed) {

                System.out.println("Fizz");
                printed = true;

            }
            while (divisibleBy5 && !printed) {

                System.out.println("Buzz");
                printed = true;

            }

            while (!printed) {

                System.out.println(i);
                printed = true;

            }
        }
    }
}
