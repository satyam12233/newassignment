package stringmethod.demo;

public class GetByteMethod {
	public static void main(String[] args) {
		
		String S1 = "SATYAM";
		byte[] barr = S1.getBytes();
		for(int i=0;i<barr.length;i++) {
		System.out.println(barr[i]);
	}
		
		String S2 = new String(barr);
		System.out.println(S2);

}
}