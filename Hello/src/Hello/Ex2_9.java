package Hello;

public class Ex2_9 {

	public static void main(String[] args) {
		String url = "www.naver.com";
		
		float f1 = .10f; //0.10, 1.0e-1
		float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		System.out.printf("f1 = %f, %e, %g%n", f1,f1,f1);
		System.out.printf("f2 = %f, %e, %g%n", f2,f2,f2);
		System.out.printf("f3 = %f, %e, %g%n", f3,f3,f3);
		
		System.out.printf("d = %f%n", d);
		System.out.printf(" = %14.10f%n", d); // 전체 14자리 중 소수점 10자리
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]", url);
		System.out.printf("[%.8s]", url);
	}
	
	// printf ()의 지시자 중 가장 자주 사용되는 지시자
	// %d = 10 정수의 형수로 출력
	// %x = 16 진수의 형식으로 출력
	// %f = 부동 소수점의 형식으로 출력
	// %c = 문자로 출력
	// %s = 문자열로 출력

}
