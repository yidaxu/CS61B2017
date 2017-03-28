/** This class outputs all palindromes in the words file in the current directory. */
public class PalindromeFinder {
    public static void main(String[] args) {
        int minLength = 4;
        In in = new In("words");
        OffByOne obo = new OffByOne();
        while (!in.isEmpty()) {
            String word = in.readString();
            if(word.length() >= minLength && Palindrome.isPalindrome(word, obo)){
            //if (word.length() >= minLength && Palindrome.isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }
} 
