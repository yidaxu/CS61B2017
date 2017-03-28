public class Palindrome{

	public static Deque<Character> wordToDeque(String word){

		Deque<Character> wordReturn = new ArrayDequeSolution<Character> ();

		for (int i = 0; i < word.length(); i += 1){
			wordReturn.addLast(word.charAt(i));
		}

		return wordReturn;

	}
	public static boolean isPalindrome(String word){
		if (word.length() == 0 || word.length() == 1){
			return true;
		}

		if (word.charAt(0) == word.charAt(word.length()-1)){
				return isPalindrome(word.substring(1, word.length()-1));
		}

		return false;

	}

	public static boolean isPalindrome (String word, CharacterComparator cc){
		if(word.length() == 0 || word.length() == 1){
			return true;
		}
		if (cc.equalChars(word.charAt(0),word.charAt(word.length()-1))){

			return  isPalindrome(word.substring(1, word.length()-1), cc);


		}
		return  false; 
	}
	public static void main(String[] args) {
		//String teste = "Hello world";
		//Deque<Character> wordReturn = wordToDeque(teste);
		//wordReturn.printDeque();
		System.out.println(isPalindrome("hello"));
		System.out.println(isPalindrome("noon"));
		OffByOne obo = new OffByOne();
		System.out.println(isPalindrome("flake",obo));

	}
}