public class problem2 {

    public static void main(String[] args) {


        System.out.println(isSumEqual("acb","cba","cdb"));



    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getIntValue(firstWord) + getIntValue(secondWord) == getIntValue(targetWord);
    }

    private static int getIntValue(String s) {
        int result = 0;
        for(int i=0;i<s.length();i++)

            // s.charAt(i)-"a" represents the value in comparison of 26 letter alphabet
            result = result * 10 + (s.charAt(i) - 'a'); // a = 97- 97-->0 , b = 98 -97

            return result;
    }

}
