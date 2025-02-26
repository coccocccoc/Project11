package object;

public class Quiz1 {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(2025, 2, 26);
		MyDate date2 = new MyDate(2025, 2, 26);

		// date1과 date2가 같은지 비교
		// equals의 원형은 인스턴스의 주소를 비교하므로 false
		// 재정의한 함수는 내용을 비교하므로 true
		System.out.println(date1.equals(date2)); // true

		MyDate date3 = new MyDate(2025, 2, 26);
		MyDate date4 = new MyDate(2025, 2, 27);

		System.out.println(date3.equals(date4)); // false

	}

}

// 날짜
class MyDate {
	int year;
	int month;
	int day;

	// 모든 멤버변수를 초기화하는 생성자
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof MyDate) { // 타입 체크
			MyDate myDate = (MyDate) obj; // 다운캐스팅
			if (year == myDate.year && month == myDate.month && day == myDate.day) {
				return true;
			}
		}
		return false;
	}

}