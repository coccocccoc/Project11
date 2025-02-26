package string;

public class Quiz2 {

	public static void main(String[] args) {

		// 7번째 위치의 문자가 1또는3이면 남자

		String id = "881120-4068234";

		// 특정 위치에 있는 문자 추출
		char gender = id.charAt(7);

		if (gender == '1' || gender == '3') {
			System.out.println("성별은 남자입니다");
		} else if (gender == '2' || gender == '4') {
			System.out.println("성별은 여자입니다");
		}

	}
}
