// https://www.codewars.com/kata/523f5d21c841566fde000009

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i : a){
            arrayList.add(i);
        }

        for (int j = 0; j < b.length; j++) {
            final int currentB = b[j];
            arrayList.removeIf(element -> element == currentB);
        }

        int[] newArray= new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            newArray[i]=arrayList.get(i);
        }
        a=newArray;
        return a;
    }
}
