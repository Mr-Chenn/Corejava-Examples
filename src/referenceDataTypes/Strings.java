package referenceDataTypes;

public class Strings {

	public static void stringMethod() {
		// TODO Auto-generated method stub
		
		String str = "Pack my box with FIVE DOZEN liquor JUgs";
		
		String str1 = "Scotch";
		String str2 = "Scotch";
		String str3 = "Beer";
		String str4 = "";
		String str5 = "            This string has spaces before and after     ";
		String str6 = "Love you darling";
		
		System.out.println("Length of the string is: " + str.length());
		System.out.println("Character at index 2 is: " + str.charAt(2));
		System.out.println(str.concat(" This is the appended string"));
		System.out.println("Contains check 1: " + str.contains("my"));
		System.out.println("Contains check 2: " + str.contains("xob"));
		System.out.println("Starts with check 1: " + str.startsWith("Pack"));
		System.out.println("Starts with check 2: " + str.startsWith("my"));
		System.out.println("Ends with check 2: " + str.endsWith("JUgs"));
		System.out.println("Ends with check 2: " + str.endsWith("lol"));
		System.out.println("Check contents are equal: " + str1.equals(str2));
		System.out.println("Check contents are equal: " + str1.equals(str3));		
		System.out.println("Index of 'h' is: " + str.indexOf('h'));
		System.out.println("Check if string is empty 1: " + str.isEmpty());
		System.out.println("Check if string is empty 2: " + str4.isEmpty());
		System.out.println("Trim the leading and trailing spaces: " + str5.trim());
		System.out.println("Replace Example: " + str6.replace("darling","dear")); 
		
		System.out.println("Substring Example 1: " + str.substring(5));
		System.out.println("Substring Example 2: " + str.substring(5, 10));
		
		char[] charArray = str.toCharArray();
		for (int i = 0; i<charArray.length; i++) {
			System.out.println("Index " + i + " is: " + charArray[i]);
		}
		
		System.out.println("Lower case: " + str.toLowerCase());
		System.out.println("Upper case: " + str.toUpperCase());


	}

}
