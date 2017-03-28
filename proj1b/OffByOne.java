public class OffByOne implements CharacterComparator{
	@Override
	public boolean equalChars(char x, char y){
		if ((x - y) == -1 || (x -y) == 1 ){
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		OffByOne obo = new OffByOne();
		System.out.println(obo.equalChars('a','b'));
		System.out.println(obo.equalChars('r','q'));
		System.out.println(obo.equalChars('a','e'));
		System.out.println(obo.equalChars('a','a'));
		System.out.println(obo.equalChars('a','z'));
	
	}
}