package string;
public  class Rotationby2places{
	// Java program to check if a string is two time 
// rotation of another string. 


	// Method to check if string2 is obtained by 
	// string 1 
	static boolean isRotated(String str1, String str2) 
	{ 
		if (str1.length() != str2.length()) 
			return false; 
	
		String clock_rot = ""; 
		String anticlock_rot = ""; 
		int len = str2.length(); 
	
		// Initialize string as anti-clockwise rotation 
		anticlock_rot = anticlock_rot + 
						str2.substring(len-2, len) + 
						str2.substring(0, len-2) ; 
	
		// Initialize string as clock wise rotation 
		clock_rot = clock_rot + 
					str2.substring(2) + 
					str2.substring(0, 2) ; 
	
		// check if any of them is equal to string1 
		return (str1.equals(clock_rot) || 
				str1.equals(anticlock_rot)); 
	} 

	public static void main(String args[]){
		String s1=new String("Abhi");
		String s2=new String("Abhi");
		
		System.out.println(s1==s2);   // compares reference id or address
		System.out.println(s1.equals(s2));; // compares values
		String s3=new String("Abhi");
		String s4="Abhi    ";
		System.out.println("Abhi"=="Abhi");
		System.out.println(s3=="Abhi");
		//System.out.println(s4.charAt(4)); RE:StringIndexOutOfBoundsException
		//* private final char value[];
		//**methods of string class does not modify value of existing variable rather they returns a new object  
		s4=s4.replace('b','x').trim().substring(1);
		System.out.println(s4);
		String str1 = "geeks"; 
		String str2 = "eksge"; 
	
		System.out.println(isRotated(str1, str2) ? "Yes"
							: "No"); 
	
		
		
		
		
	}
}