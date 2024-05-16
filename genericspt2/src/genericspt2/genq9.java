package genericspt2;
import java.util.HashSet;

public class genq9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6, 7, 5};

        
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Repeating integers in the array:");
        for (int num : arr) {
            if (!set.add(num)) {
                
                System.out.print(num + " ");
            }
        }
    }
}
