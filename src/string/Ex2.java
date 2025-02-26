package string;

public class Ex2 {

	public static void main(String[] args) {

		String str = "test";
		System.out.println(str.hashCode()); // 주소 확인
		
		str = "aaa"; // 문자열 교체
		System.out.println(str.hashCode()); // 주소 확인
		
		// 문자열은 값을 젼경할 수 없는 구조로, 
		// 새로운 문자열을 생성하여 가리킨다
		
	}

}
