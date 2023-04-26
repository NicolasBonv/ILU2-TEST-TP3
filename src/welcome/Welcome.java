package welcome;

public class Welcome {

	public static String welcome(String input) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello, ");
		sb.append(Character.toUpperCase(input.charAt(0)));
		for(int i=1;i<input.length();i++) {
			sb.append(input.charAt(i));
		}
		return sb.toString();
	}

}
