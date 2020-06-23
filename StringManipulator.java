public class StringManipulator {
    public String trimAndConcat (String str1, String str2) {
        String output = str1.trim().concat(str2.trim());
        return output;
    }

    public Integer getIndexOrNull (String str, char letter) {
        if (str.indexOf(letter) > -1) {
            return str.indexOf(letter);
        }
        else {
            return null;
        }
    }

    public Integer getIndexOrNull (String str1, String str2) {
        if (str1.indexOf(str2) > -1) {
            return str1.indexOf(str2);
        }
        else {
            return null;
        }
    }

    public String concatSubstring (String str1, int number1, int number2, String str2) {
        return str1.substring(number1, number2).concat(str2);
    }
}