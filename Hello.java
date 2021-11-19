public class Hello{
	public static void main(String[] args) {
		int resul = sum(4,5);
		System.out.println(resul);

		int mulRes = mul(4,3);
		System.out.println(mulRes);
	}

	static int sum(int x, int y){
		return x + y;
	}
	static int mul(int x, int y){
		return x*y;
	}
}