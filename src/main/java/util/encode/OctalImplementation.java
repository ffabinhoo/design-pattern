package util.encode;

import java.math.BigInteger;

public class OctalImplementation {

	public static void main(String[] args) {
		String input = "31646541";
		//String input = "1163114742311135167021343424004141432061264036716605455350700124251451433665154621070427104557201067171276700627170465777043334607301704736021762632546715076300657713354152655466766041402716542312670131505761476052650004524216161770521652245433114475436547416173670422136456436313334657533062163564254163664432653550166600433332675642447003252221104064117622317044717471253";
		
		String input2 = reverseString(input.toCharArray());
		BigInteger dec_value = BigInteger.ZERO;
		BigInteger base = BigInteger.ONE;

		for (char val : input2.toCharArray()) {
			int i = Character.getNumericValue(val);  
			BigInteger last_digit = BigInteger.valueOf(i);
			dec_value = dec_value.add(base.multiply(last_digit));
			base = base.multiply(BigInteger.valueOf(8));
		}

		byte[] result = dec_value.toByteArray();
		System.out.println("=====");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

	public static String reverseString(char[] s) {
		StringBuilder sb = new StringBuilder();
		char aux;
		int j = s.length - 1;
		for (int i = 0; i < s.length / 2; i++) {
			aux = s[i];
			s[i] = s[j];
			s[j] = aux;
			j--;
		}
		
		for (char c : s) {
			sb.append(c);
		}
		return sb.toString();
		
	}
}
