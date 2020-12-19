
import java.util.*;

public class LoopMaps {
    private int sum;
    private int product;
    // private int solution;
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    public void getNumbers() {
        Scanner operators = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Please enter five numbers.");
        System.out.println("First Number: ");
        numbers.add(operators.nextInt());
        System.out.println("Second Number: ");
        numbers.add(operators.nextInt());
        System.out.println("Third Number: ");
        numbers.add(operators.nextInt());
        System.out.println("Fourth Number: ");
        numbers.add(operators.nextInt());
        System.out.println("Fifth Number: ");
        numbers.add(operators.nextInt());
        sum = numbers.stream().mapToInt(n -> n).sum();
        System.out.println("The sum of your numbers is " + sum);
        Collections.sort(numbers);
        int small = numbers.get(0);
        System.out.println("The smallest number is " + small);
        int big = numbers.get(4);
        System.out.println("The largest number is " + big);
        // System.out.println(numbers.size());
        // System.out.println(numbers.get(4));
    }

    public static void main(String[] args) throws Exception {
        LoopMaps nums = new LoopMaps();
        nums.getNumbers();
        // nums.add();

        // System.out.println("Fifth Number: ");
        // System.out.println("Fifth Number: ");
        // System.out.println("Fifth Number: ");
    }
}
