public class ExcerciseString {
	
	public static void isSame(String s1, String s2) {
		if (s1.matches(s2))
			System.out.println("Both are same");
		else
			System.out.println("Both are different");
	}

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println("The char at index 12 is : "+str.charAt(12));
		
		boolean is = str.contains("is");
		if (is==true) 
			System.out.println("\"is\" is present in the string");
		else
			System.out.println("\"is\" is absent in the string");
		
		String str2 = str + " and kills it";
		System.out.println(str2);
		
		int l = str.length() - 1;
		System.out.println(str.substring(l-3));
		if (str.substring(l-4) == "dogs")
			System.out.println("Ends with dogs");
		else
			System.out.println("Doesnt end with dogs");
	
		String str3 = "The quick brown Fox jumps over the lazy Dog";
		isSame(str, str3);
	
		String str4 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		isSame(str, str4);
		
		System.out.println("The string is "+str.length()+" characters long");
		
		String str5 = "The quick brown Fox jumps over the lazy Dog";
		isSame(str, str5);
		
		str = str.replace("The", "A");
		System.out.println(str);

		//split
		String[] arry = str.split(" j");
		arry[1] = "j" + arry[1];
		for (String s : arry) {
			System.out.println(s);
		}
		
		//names alone
		
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println("'a' starts at "+str.indexOf('a'));
		System.out.println("'e' ends at "+str.lastIndexOf('e'));
	}
}
