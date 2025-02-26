package string;

//리턴타입: int
//매개변수: String
//함수이름: getCharCount

//메소드의 종류: 인스턴스 메소드 / static 메소드
public class Quiz4 {

	public static void main(String[] args) {
		System.out.println(getCharCount("자바 프로그래밍 입문"));
		System.out.println(getCharCount("equals 메소드는 두 객체가 같은지 비교한다"));
	}

	public static int getCharCount(String str) {
		String newStr = str.replace(" ", "");
		return newStr.length();
	}

}