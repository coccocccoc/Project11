package string;

public class Quiz1 {

	public static void main(String[] args) {

		String str1 = "a:b:c:e";
		System.out.println(str1.replace(':', '#'));
		
		String str2 = "안녕하세요 저는 둘리입니다";
		System.out.println(str2.substring(9, 11)); // 시작위치, 마지막위치(포함x)
		// 눈으로 찾아도 되지만 인덱스를 찾는 함수를 사용해도 됨
		// "둘리"의 인덱스 찾기
		System.out.println(str2.indexOf("둘")); 
		System.out.println(str2.indexOf("리")); 

	}

}
