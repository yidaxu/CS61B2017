public class OffByN implements CharacterComparator{

	private int N;

	public OffByN(int N){
		this.N = N;
	}

	@Override
	public boolean equalChars(char x, char y){

		if ((x - y) == -N || (x - y) == N){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		OffByN obo = new OffByN(5);
		System.out.println(obo.equalChars('a','f'));
		System.out.println(obo.equalChars('f','h'));
	
	}
}