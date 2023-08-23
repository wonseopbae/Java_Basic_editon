package Hello;

public class Ex2_12 {

	public static void main(String[] args) {
		
		// (char)(3 + '0') -> '3' 숫자를 문자로 변환하고 숫자에 0을 더한다.
		// '3' - 0 -> 3 문자에서 0을 뺀다.
		// Integer.parseInt("3) -> 3 문자열을 숫자로 변환할때 Integer.parseInt() 또는 Double.parseDouble()을 사용한다.
		// "3".chatAt(0) -> 3 charAt(0)을 사용한다.
		// '3' + "" -> "3" 문자를 문자열로 변환할 떄 빈 문자열 ("")을 더한다.
		
		
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');
		System.out.println('3' - '0' + 1);
		System.out.println(Integer.parseInt("3") + 1);
		System.out.println("3" + 1);
		System.out.println((char)(3 + '0'));
	}

}
