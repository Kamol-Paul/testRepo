import java.util.*;

class Cal{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		char operaator = in.nextChar();

		int x = in.nextInt();
		int y = in.nextInt();

		if(operaator == '+'){
			Sum obj = new Sum();

			obj.setData(x,y);

			System.out.pritln(obj.getSumVal());
		}

	}
}