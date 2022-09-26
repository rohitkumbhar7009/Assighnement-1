class SeriesRec{
	public static void main(String args[]){
		int n = 10;
		series(n);
	}
	
	static int series(int n){
		if(n==1) {
			System.out.print("1");
			return 1;
		}
		else {
			System.out.print(n+" ");
			return series(n-1);
		}
	}
}
