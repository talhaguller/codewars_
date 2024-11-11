import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sonuc=ArrayDiff.arrayDiff(new int[] {2}, ArrayDiff.arrayDiff(new int [] {1,2}, new int[] {1}));
        System.out.println(Arrays.toString(sonuc));

    }
}