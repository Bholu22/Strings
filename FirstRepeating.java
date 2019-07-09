public class FirstRepeating{
	static int min(int a,int b){
		return (a<b)?a:b;
	}
	static void find(String str){
		int count[]=new int[256];
		for(int i=0;i<256;i++){
			count[i]=-1;
		}
		int res=Integer.MAX_VALUE;
		for(int i=0;i<str.length();i++){
			if(count[str.charAt(i)]==-1)
				count[str.charAt(i)]=i;
			else
				res=min(res,count[str.charAt(i)]);
		}
		System.out.println(str.charAt(res));
		
	}
	public static void main(String args[]){
		String str="abhishek";
		find(str);
	}
}