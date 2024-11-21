import java.util.Arrays;

class commandstr {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please enter exactly five strings.");
            return;
        }

        String[] strings = new String[5];
        boolean containsOnlyNumbers = true;

        // Copying command line arguments into the strings array
        for (int i = 0; i < 5; i++) {
            strings[i] = args[i];
            if (!args[i].matches("\\d+")) { // Check if the string is not a number
                containsOnlyNumbers = false;
            }
        }

        // Check if all entered strings are numbers
        if (containsOnlyNumbers) {
            System.out.println("Error: Please enter at least one non-numeric string.");
            return;
        }

        // Sorting the strings array
        Arrays.sort(strings);

        // Displaying the sorted strings
        System.out.println("Sorted strings: " + Arrays.toString(strings));
    }
}
