package basics;

// Fizzbuzz with no user input
public class FizzBuzz {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        for (int i = start; i <= end; i++){
            String result = "";

            if (i % 3 == 0){
                result += "Fizz";
            }

            if (i % 5 == 0){
                result += "Buzz";
            }

            System.out.printf("%d: %s%n", i, result);
        }
    }
}
