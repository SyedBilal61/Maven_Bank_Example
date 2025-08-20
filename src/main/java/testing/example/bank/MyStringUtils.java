package testing.example.bank;

public class MyStringUtils {
	public String leftTrim(String input) {
		 if(input==null||input.isEmpty())
	        return input;

	    int beginIndex = 0;
	    final int length = input.length();

	    while (beginIndex < length && Character.isWhitespace(input.charAt(beginIndex))) {
	        beginIndex++;
	    }

	    return input.substring(beginIndex);
	}

}
