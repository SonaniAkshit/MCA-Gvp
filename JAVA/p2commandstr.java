//Write a program to read five strings from command line and sort them and display.

import java.util.Arrays;

class p2commandstr {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please enter exactly five strings.");
            return;
        }

        String[] strings = new String[5];
        boolean containsOnlyNumbers = true;

        for (int i = 0; i < 5; i++) {
            strings[i] = args[i];
            if (!args[i].matches("\\d+")) { 
                containsOnlyNumbers = false;
            }
        }

        if (containsOnlyNumbers) {
            System.out.println("Error: Please enter at least one non-numeric string.");
            return;
        }

        Arrays.sort(strings);

        System.out.println("Sorted strings: " + Arrays.toString(strings));
    }
}
