package string;

import java.util.Scanner;

// 입력받은 문자열을 거꾸로 출력
// ex.안녕하세요 -> 요세하녕안
public class Quiz5 {

	public static void main(String[] args) {

		// 키보드에서 문자열 입력받기
		Scanner scanner = new Scanner(System.in);
	
		String str = scanner.nextLine();
		
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));	
		}
		
	}

}
