package practicestring;
public class LexicographicalRank{
	static int fact(int n){
		return (n<=1)?1:n*fact(n-1);
	}
	static int returnsmaller(String str,int low,int high){
		int countsmaller=0,i;
		for(i=low+1;i<=high;i++){
			if(str.charAt(i)<str.charAt(low))
				countsmaller++;
		}
		return countsmaller;
	}
	static int returnrank(String str){
		int n=str.length();
		int mul=fact(n);
		int countsmall=0;
		int rank=1;
		for(int i=0;i<n;i++){
			mul/=n-i;
			countsmall=returnsmaller(str,i,n-1);
			rank+=mul*countsmall;
		}
		return rank;
	}
	public static void main(String args[]){
		String str="string";
		int rank=returnrank(str);
		System.out.println(rank);
	}
}