package string;

public class Quiz3 {

	public static void main(String[] args) {
		// "자바 프로그래밍 입문" 이라는 문자열을 만드세요
		// 공백을 제외한 글자수만 세어서 출력하세요 (11 > 9)
		
		String str = "자바 프로그래밍 입문";
		
		// 공백도 문자로 취급
		System.out.println(str.length()); // 공백포함 길이 11
		
		String a = str.substring(0, 2); //자바
		String b = str.substring(3, 8); //프로그래밍
		String c = str.substring(9, 11); //입문
		
		String ab = a.concat(b);
		String abc = ab.concat(c);

		System.out.println(abc.length());
		
		// 1. 반복문을 사용하여 공백을 제외한 문자 개수 세기
		int size = 0;
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)); // i는 인덱스
			// 현재 문자 != 공백
			if(str.charAt(i) != ' ') {
				size++; // 공백이 아니라면 값 증가
			}
		}
		System.out.println(size); // 9
		
		// 2. 공백을 제거
		String newStr = str.replace(" ", "");
		System.out.println(newStr + " " + newStr.length());
		
	}
}
