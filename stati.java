class stati{
	int sum;
	public void add(int a,int b){
		sum=a+b;
	}
	public static void main(String [] args){
		stati obj = new stati();
		obj.add(10,10);
		System.out.println(sum)	;
	}
}