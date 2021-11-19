public class Hello{
	public static void main(String[] args) {
		int resul = sum(4,5);
		System.out.println(resul);

		int subRes = sub(10,7);
		System.out.println(subRes);
	}

	static int sum(int x, int y){
		return x + y;
	}

	static int sub(int a, int b){
		return a-b;
	}
}