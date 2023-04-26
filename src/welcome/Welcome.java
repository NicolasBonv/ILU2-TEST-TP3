package welcome;

public class Welcome {

	public static String welcome(String input) {
		StringBuilder sb = new StringBuilder();
		if(( input == null) || (input.equals("")) || (input.equals(" "))) {
				sb.append("Hello, my friend");
		}else {
			sb.append("Hello, ");
			sb.append(Character.toUpperCase(input.charAt(0)));
			for(int i=1;i<input.length();i++) {
				sb.append(input.charAt(i));
			}
		}
		return sb.toString();
	}
}
