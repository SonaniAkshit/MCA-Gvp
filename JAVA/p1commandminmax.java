//Write a program to read five integer numbers from command line and sort them and display
//minimum, maximum values out of it.

import java.util.Arrays;
class p1commandminmax {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please enter exactly five integers.");
            return;
        }

        int[] numbers = new int[5];

        try {
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
            return;
        }

        Arrays.sort(numbers);

        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
        System.out.println("Minimum value: " + numbers[0]);
        System.out.println("Maximum value: " + numbers[numbers.length - 1]);
    }
}
