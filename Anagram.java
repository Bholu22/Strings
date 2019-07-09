public class Anagram{
	static boolean check(String str1,String str2){
		int i;
		int count1[]=new int[256];
		for(i=0;i<256;i++)
			count1[i]=0;
		int count2[]=new int[256];
		for(i=0;i<256;i++)
			count2[i]=0;
		
		if(str1.length()!=str2.length())
			return false;
		for(i=0;i<str1.length() && i<str2.length();i++){
			count1[str1.charAt(i)]++;
			count2[str2.charAt(i)]++;
		}
		for(i=0;i<256;i++){
			if(count1[i]!=count2[i])
				return false;
		}
		
		return true;
		
	}
	public static void main(String args[]){
		String str1="ABBBHHII";
		String str2="AIIHHBBB";
		if(check(str1,str2))
			System.out.println("Yes Both Strings are Anagram!!!!");
		else
			System.out.println("They are not Anagram!!!!");

		
	}
}
/*
static boolean areAnagram(String str1, String str2)  
{  
    // If two strings have different length  
    if (str1.length() != str2.length())  
    {  
        return false;  
    }  
  
    // To store the xor value  
    int value = 0;  
  
    for (int i = 0; i < str1.length(); i++)  
    {  
        value = value ^ (int) str1.charAt(i);  
        value = value ^ (int) str2.charAt(i);  
    }  
  
    return value == 0;  
  
} 
*/
/*
optimised code!!!!!!!!!!!!!!!!!!!!!!!!
bool areAnagram(char* str1, char* str2) 
{ 
    // Create a count array and initialize all values as 0 
    int count[NO_OF_CHARS] = { 0 }; 
    int i; 
  
    // For each character in input strings, increment count in 
    // the corresponding count array 
    for (i = 0; str1[i] && str2[i]; i++) { 
        count[str1[i]]++; 
        count[str2[i]]--; 
    } 
  
    // If both strings are of different length. Removing this condition 
    // will make the program fail for strings like "aaca" and "aca" 
    if (str1[i] || str2[i]) 
        return false; 
  
    // See if there is any non-zero value in count array 
    for (i = 0; i < NO_OF_CHARS; i++) 
        if (count[i]) 
            return false; 
    return true; 
} 
*/