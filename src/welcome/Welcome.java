package welcome;

public class Welcome {

	public static String welcome(String input) {
		StringBuilder sb = new StringBuilder();
		if(( input == null) || (input.equals("")) || (input.equals(" "))) {
				sb.append("Hello, my friend");
		}else if(input.length()>3) {
			sb.append("Hello, ");
			sb.append(Character.toUpperCase(input.charAt(0)));
			for(int i=1;i<input.length();i++) {
				if(input.charAt(i) == ',') {
					sb.append(", ");
					sb.append(Character.toUpperCase(input.charAt(i+1)));
					i++;
				}else {
				sb.append(input.charAt(i));
				}
			}
		}
		else if(input.equals(input.toUpperCase())){
			sb.append("HELLO, ");
			sb.append(input);
			sb.append(" !");
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
