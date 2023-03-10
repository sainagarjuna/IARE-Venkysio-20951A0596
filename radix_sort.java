#radix sort using java
import java.util.*;

public class RadixSort {
    public static ArrayList<Integer> radixSort(ArrayList<Integer> a) {
        int big = Collections.max(a);
        int size = String.valueOf(big).length();
        ArrayList<Integer> resArr = new ArrayList<>();
        
        for (int i = 0; i < size; i++) {
            ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(10);
            for (int j = 0; j < 10; j++) {
                buckets.add(new ArrayList<>());
            }
            
            for (int num : a) {
                int digitValue = (int) ((num / Math.pow(10, i)) % 10);
                buckets.get(digitValue).add(num);
            }
            
            for (ArrayList<Integer> bucket : buckets) {
                resArr.addAll(bucket);
            }
        }
        return resArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        while (scanner.hasNextInt()) {
            a.add(scanner.nextInt());
        }
        ArrayList<Integer> res = radixSort(a);
        System.out.println(res);
    }
}
