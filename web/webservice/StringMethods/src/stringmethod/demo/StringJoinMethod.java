package stringmethod.demo;

public class StringJoinMethod {
	public static void main(String[] args) {
		String S1 =String.join("-","Welcome","to","Java","Point");
		String date = String.join("/","2021","23","12");
		String time = String.join(":","12","12","00");
		System.out.println(S1);
		System.out.println(date);
		System.out.println(time);
	}
}
