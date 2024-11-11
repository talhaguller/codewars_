// https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java


import java.util.Collections;
import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        Collections.reverse(binary);

        int total=0;
        for (int i = 0; i < binary.size(); i++) {
            if (binary.get(i)==1){
                total+=(int) Math.pow(2,i);
            }
        }

        return total;
    }

}
// 0 1 2 3
// 3 2 1 0