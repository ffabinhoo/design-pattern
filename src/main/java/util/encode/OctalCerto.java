package util.encode;

public class OctalCerto {
	
	public String encode(byte[] values ) {
		byte[] input = values;
        String expected = "31646541";
        String result = Encoder.encode(input, Base8Encorder.getInstance());
		return result;
	}

	public static void main(String[] args) {
		OctalCerto oc = new OctalCerto();
		String result = oc.encode(new byte[]{103, 77, 97});
		System.out.println(result);
	}

}
