// https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java

public class Isogram {
    public static boolean  isIsogram(String str) {
        if (str != "") {
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
