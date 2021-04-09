import java.util.Scanner;
class Factorial{
		public int fact(int n){
			if (n==1)		
				return n;
			else {
				return n*fact(n-1);
			}
		}
		public static void main(String [] args){
			int a,b;
			Scanner sc=new Scanner(System.in);
			Factorial obj= new Factorial();
			System.out.println("Enter the Number:");
			b=sc.nextInt();
			a=obj.fact(b);
			System.out.println("Factorial:"+a);
		}
}