package wrapper;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// nextLine: 키보드를 통해 문자열을 입력받는 함수
		// nextLine을 사용한 만큼 문자열을 입력받음
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();

		// 문자열 -> 정수 형변환
		// wrapper 클래스의 parse 로 시작하는 함수 사용
		// "10" -> 10, "5" -> 5
		int i = Integer.parseInt(str1) + Integer.parseInt(str2);
		System.out.println(i);

	}

}
