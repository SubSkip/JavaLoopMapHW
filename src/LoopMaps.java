
import java.util.*;

public class LoopMaps {
    private int sum = 0;
    private int product = 1; // Need to set product to 1 for multiplication

    List<Integer> numbers = new ArrayList<>();

    public void getNumbers() {
        Scanner operators = new Scanner(System.in);
        System.out.println("Please enter five numbers.");
        for (int i = 0; i < 5; i++) {
            numbers.add(operators.nextInt());
        }
        // Changed to for loop
        // System.out.println("First Number: ");
        // numbers.add(operators.nextInt());
        // System.out.println("Second Number: ");
        // numbers.add(operators.nextInt());
        // System.out.println("Third Number: ");
        // numbers.add(operators.nextInt());
        // System.out.println("Fourth Number: ");
        // numbers.add(operators.nextInt());
        // System.out.println("Fifth Number: ");
        // numbers.add(operators.nextInt());
        sum = numbers.stream().mapToInt(n -> n).sum();
        System.out.println("The sum of your numbers is " + sum);
        for (int i = 0; i < 5; ++i) {
            product *= numbers.get(i);
        }
        System.out.println("The product of your numbers is " + product);
        // Collections.sort(numbers);
        // int small = numbers.get(0);
        System.out.println("The smallest number is " + Collections.min(numbers));
        // int large = numbers.get(4);
        System.out.println("The largest number is " + Collections.max(numbers));
        operators.close();
    }

    public static void main(String[] args) throws Exception {
        LoopMaps nums = new LoopMaps();
        nums.getNumbers();
    }
}
