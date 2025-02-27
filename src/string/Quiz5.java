package string;

import java.util.Scanner;

// 입력받은 문자열을 거꾸로 출력
// ex.안녕하세요 -> 요세하녕안
public class Quiz5 {

	public static void main(String[] args) {

		// 키보드에서 문자열 입력받기
		Scanner scanner = new Scanner(System.in);
	
		String str = scanner.nextLine();
		
		// length: 문자열의 길이
		System.out.println(str.length());
		
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));	
		}
		
		
		// StringBuilder 클래스를 사용한 방법
		StringBuilder builder = new StringBuilder("안녕하세요");
		
		// reverse: 문자열을 뒤집는 함수
		builder.reverse();
		
		System.out.println(builder);
	}

}
