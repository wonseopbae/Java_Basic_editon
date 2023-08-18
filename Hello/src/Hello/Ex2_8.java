package Hello;

public class Ex2_8 {

	public static void main(String[] args) {
		int x = 10, y = 5; //변수 x에 10을 담고 y에 5를 담다.
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		int tmp = x; // 변수 tmp에 x를 저장한다.
		x = y; // y의 값을 x에 저장한다.
		y = tmp; //tmp에 저장된 값을 y에 저장한다.
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
