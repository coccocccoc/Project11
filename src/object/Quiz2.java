package object;

public class Quiz2 {

	public static void main(String[] args) {

		Object obj = new Student(1002, "또치"); // 형변환
		
		// Object 타입 변수로는 학번과 이름을 사용할 수 없음

		if (obj instanceof Student) { // 타입 확인
			Student student = (Student) obj; // 다운캐스팅
			System.out.println("학번: " + student.id + ", 이름: " + student.name); // 실제 인스턴스의 속성 사용
		}

	}

}
