package Hello;

public class test1 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		
		x = y;
		y = z;
		z = x;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

}
