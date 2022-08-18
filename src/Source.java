import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
        int [] arr= new int[]{0, 1, 2, 3, 5, 8, 13};
        int n =3;
        System.out.println(Arrays.equals(take(arr, n), new int[]{0, 1, 2}));
    }
    public static int[] take(int[] arr, int n) {
        return Arrays.copyOf(arr, n);
    }
}
