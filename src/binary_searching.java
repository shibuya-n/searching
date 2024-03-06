import java.util.*;

public class binary_searching {
    public static void linear_search(int[] x, int int_to_search_for){
        for (int i = 0; i < x.length; i++){
            if(x[i] == int_to_search_for){
                System.out.println(int_to_search_for + " found");
                return;
            }
        }
    }

    public static void binary_search(int[] x, int int_to_search_for){
        int left = 0;
        int right = x.length - 1;
        int middle;

        while (left <= right){
            middle = (left + right) / 2;
            if (int_to_search_for > x[middle]){
                left = middle + 1;
            }
            else if (int_to_search_for < x[middle]){
                right = middle - 1;
            }
            else if (int_to_search_for == x[middle]){
                System.out.println(int_to_search_for + " found.");
                break;
            }
        }
        return;
    }
}
