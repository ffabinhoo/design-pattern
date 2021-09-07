package util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InsertString {

	public void insertString() {
		ArrayList<String> str = new ArrayList<String>();
		str.add("1563454984001|INSERT|test|123");
		String a = "1563454984001|INSERT|test|123";
		String[] t = a.split("|");
		  List<String[]> vals = str.stream() .map(s -> s.split("\\|"))
		  .collect(Collectors.toCollection(ArrayList::new));
		  System.out.println(vals.get(0)[1]);
	}

}
