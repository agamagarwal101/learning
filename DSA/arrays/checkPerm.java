import java.util.HashMap;

public class checkPerm {

    private static boolean checkPermutations(int arr1[], int arr2[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if (hm.get(arr1[i]) == null) {
                hm.put(arr1[i], 1);
            } else {
                hm.put(arr1[i], hm.get(arr1[i]) + 1);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (hm.get(arr2[i]) == null || hm.get(arr2[i]) == 0) {
                return false;
            }
            hm.put(arr2[i], hm.get(arr2[i]) - 1);
        }
        return true;

    }

    public static void main(String args[]) {
        int arr1[] = { 2, 1, 3, 5, 4, 3, 2 };
        int arr2[] = { 3, 2, 2, 4, 5, 3, 1 };
        System.out.println(checkPermutations(arr1, arr2));
        int arr3[] = { 2, 1, 3, 5, };
        int arr4[] = { 3, 2, 2, 4 };
        System.out.println(checkPermutations(arr3, arr4));
    }

}