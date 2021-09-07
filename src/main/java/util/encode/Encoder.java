package util.encode;

import java.math.BigInteger;

public class Encoder {

    public static byte[] decode(String num, IEncode encoder) {
        BigInteger dec_value = BigInteger.ZERO;
        BigInteger base = BigInteger.ONE;

        int temp = num.length();
        while (temp > 0) {
            BigInteger last_digit = BigInteger.valueOf(encoder.getVal(num.charAt(--temp)));
            dec_value = dec_value.add(base.multiply(last_digit));
            base = base.multiply(encoder.getBase());
        }

        return dec_value.toByteArray();
    }

    public static String encode(byte[] byteArr, IEncode encoder) {
        StringBuilder result = new StringBuilder();
        BigInteger dec_value = new BigInteger(byteArr);
        BigInteger base = encoder.getBase();

        
        while (!dec_value.equals(BigInteger.ZERO)) {
        	int mod = dec_value.mod(base).intValue();
            result.append(encoder.getChar(mod));
            dec_value = dec_value.subtract(BigInteger.valueOf(mod)).divide(base);
        }

        return result.reverse().toString();
    }

}
