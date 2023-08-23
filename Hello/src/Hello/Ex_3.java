package Hello;

public class Ex_3 {

	public static void main(String[] args) {
		
		// 증가 연산자 (++)
		// 감소 연산자 (--)
		
		int i = 5, j = 0;
		
		j = i++; // 변수 j에 변수 i 값에 1을 증가한 값을 담는다.
		
		System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);
		
		// 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경 한다.
		
		i = 5;
		j = 0;
		
		
		// ++i 전위형이고 의 값을 1씩 증가 시킨다.
		// i++ 후위형이고 위의 문장과 차이가 없다.
		
		j = ++i;
		
		System.out.println("j = ++i, 실행 후, i = " + i + ", j = " + j);
		
	}

}
