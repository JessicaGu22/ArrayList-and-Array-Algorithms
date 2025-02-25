import java.util.ArrayList;
import java.util.Collections;

public class ArrayAlgorithms {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 7, 2, 8, 3, 9, 4, 1, 5, 6, 10, 12, 15);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        System.out.println("Mean: " + (double) sum / numbers.size());

        int smallest = Collections.min(numbers);
        System.out.println("Smallest: " + smallest);

        int biggest = Collections.max(numbers);
        System.out.println("Biggest: " + biggest);

        int mostCommon = numbers.get(0);
        int mostCommonCount = 0;
        for (int num : numbers) {
            int count = Collections.frequency(numbers, num);
            if (count > mostCommonCount) {
                mostCommon = num;
                mostCommonCount = count;
            }
        }
        System.out.println("Mode: " + mostCommon);

        ArrayList<Integer> reversed = new ArrayList<>(numbers);
        Collections.reverse(reversed);
        System.out.println("Reversed:");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println();

        int shift = 3;
        ArrayList<Integer> shifted = new ArrayList<>(numbers);
        Collections.rotate(shifted, shift);
        System.out.println("Shifted by " + shift + ":");
        for (int num : shifted) {
            System.out.print(num + " ");
        }
        System.out.println();

        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("After removing evens: " + numbers);

        ArrayList<Integer> doubled = new ArrayList<>();
        for (int num : numbers) {
            doubled.add(num * 2);
        }
        System.out.println("Doubled elements: " + doubled);

        ArrayList<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);
        double median;
        if (sortedNumbers.size() % 2 == 0) {
            median = (sortedNumbers.get(sortedNumbers.size() / 2 - 1) + sortedNumbers.get(sortedNumbers.size() / 2))
                    / 2.0;
        } else {
            median = sortedNumbers.get(sortedNumbers.size() / 2);
        }
        System.out.println("Median: " + median);

        int range = biggest - smallest;
        System.out.println("Range: " + range);
    }
}
