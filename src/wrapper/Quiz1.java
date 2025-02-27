package wrapper;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 문자열을 다른 타입으로 형변환할때는
		// parse~ 로 시작하는 함수를 사용
		
		// 문자열 "10"을 byte short int long 으로 변환
		String str = "10";
		byte b = Byte.parseByte(str);
		short s = Short.parseShort(str);
		int i = Integer.parseInt(str);
		long l = Long.parseLong(str);
				
		// 문자열 "10.0"을 float double로 변환
		String str2 = "10.0";
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		
	}

}
