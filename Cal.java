import java.util.*;

class Cal{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		char operaator = in.next().charAt(0);

		int x = in.nextInt();
		int y = in.nextInt();

		if(operaator == '+'){
			Sum obj = new Sum();

			obj.setData(x,y);

			System.out.println(obj.getSumVal());
		}
		else if (operaator == '-'){
			Sub  obj = new Sub();
			obj.setData(x,y);
			System.out.println(obj.getVal());
		}

	}
}