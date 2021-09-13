package stringmethod.demo;

public class CompareTo {
	public static void main(String arg[]) {
		String s1 = "Satyam";
		String s2 = "Satyam";
		String s3 = "Satyam Tripathi";
		String s4 = "SatyamT";
		
		System.out.println(s1.compareTo(s2)); // 0 because s1 and s2 are equal
		System.out.println(s1.compareTo(s3)); // -9 because s1 is lower than s3
		System.out.println(s1.compareTo(s4)); // -1 because s1 is lower than s4
		System.out.println(s2.compareTo(s1)); // 0 because s2 and s1 are equal
		System.out.println(s4.compareTo(s1)); // 1 because s4 1 times greater than s1
	}
}
