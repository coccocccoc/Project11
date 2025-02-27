package string;

import java.util.Scanner;

// 키보드에서 문자열을 입력받는 무한루프에 "end" 또는 "END"가 입력되면 종료되는
public class Quiz6 {

	public static void main(String[] args) {
				
		// 키보드에서 문자열 입력받기
		Scanner scanner = new Scanner(System.in);
	
		// 반복문 안에서 사용하는 키워드
		// break: 종료
		// continue: 스킵
		while(true) {
			String str = scanner.nextLine();
			
			// 입력받은 문자열이 end라면 루프 종료 
			// equalsIgnoreCase: 대소문자 상관없이 비교
			if(str.equalsIgnoreCase("END")) {
				// end END End eND
				break;
			}
		}
		
		
		
		
		// while(조건): 조건을 만족할 때 까지 반복
		// 조건이 항상 true라면? 무한루프에 빠진다..
//		while(true) {
//			System.out.println("안녕하세요");
//		}
		
		
		
	}

}
