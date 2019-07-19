package practicestring;
public class CheckRotated{
	static boolean check(String s1,String s2){
		return (s1.length()==s2.length()) && ((s1+s2).indexOf(s2)!=-1);
	}
	public static void main(String args[]){
		String s1="abcd";
		String s2="cdba";
		System.out.println(check(s1,s2));
	}
}