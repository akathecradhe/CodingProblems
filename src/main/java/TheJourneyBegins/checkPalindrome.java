package TheJourneyBegins;

public class checkPalindrome {


    public static void main(String[] args) {

        System.out.println(palindromeChecker("hello"));
        System.out.println(palindromeChecker("racecar"));

    }


    static boolean palindromeChecker(String inputString) {

        boolean isPalindrome=false;
        String reverse= "";
        int count = 0 ;
        System.out.println(inputString);
        for(int  i= inputString.length()-1; i >= 0; i--){
            reverse = reverse + inputString.charAt(i);
            System.out.println(i);

        }
        System.out.println("r "+reverse);
        System.out.println("i "+inputString);

        if (reverse.matches(inputString)){
            System.out.println("match");
            isPalindrome=true;
        }

        return isPalindrome;
    }
}
