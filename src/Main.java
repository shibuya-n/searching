import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // sorted array of integers
        int[] x = {1, 3, 4, 9, 10,
                24, 25, 27, 28, 29,
                31, 33, 34, 37, 39,
                41, 43, 45, 48, 59,
                61, 63, 64, 79, 81,
                82, 83, 91, 92, 94};
        Scanner scanner_obj = new Scanner(System.in);

        boolean doing = true;
        while (doing) {
            System.out.println("What number are we searching for?");

            String stringReceive = scanner_obj.nextLine();
            if (stringReceive.equals("done")){
                doing = false;
            }
            else {
                int int_to_search_for = Integer.parseInt(stringReceive);

                long startTime = System.nanoTime();
                binary_searching.linear_search(x, int_to_search_for); //linear search
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                System.out.println(duration + " nanoseconds");

                startTime = System.nanoTime();
                binary_searching.binary_search(x, int_to_search_for);
                endTime = System.nanoTime();
                duration = (endTime - startTime);
                System.out.println(duration + " nanoseconds.");
            }
        }
    }
}