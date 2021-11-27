import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arrayNumbers = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int[] absNumbers = new int [5];
        int j=0;
        for (int i : arrayNumbers) {
            if (i > 0 && i % 2 == 0) {
                absNumbers[j++] = i;
            }
        }
        Arrays.sort(absNumbers);
        System.out.println(Arrays.toString(absNumbers));
    }
}