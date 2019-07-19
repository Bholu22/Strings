package practicestring;
public class IsomorphicString{
	static boolean checkIsomorphic(String str1,String str2){
		int m=str1.length();
		int n=str2.length();
		boolean marked[]=new boolean[256];
		for(int i=0;i<256;i++){
			marked[i]=false;
		}
		if(n!=m)
			return false;
		int map[]=new int[256];
		for(int i=0;i<256;i++){
			map[i]=-1;
		}
		for(int i=0;i<m;i++){
			//character of str1 is seen for the first time
			if(map[str1.charAt(i)]==-1){
				
				if(marked[str2.charAt(i)]==true)
					return false;
				marked[str2.charAt(i)]=true;
				map[str1.charAt(i)]=str2.charAt(i);
			}
			else if(map[str1.charAt(i)]!=str2.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String args[]){
		String str1="aab";
		String str2="xxy";
		System.out.println(checkIsomorphic(str1,str2));
	}
}