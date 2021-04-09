class student{
		String name,phone;
		int roll_no;
}
class array1{
	public static void main(String[] args){
		student[] std = new student[2];
		student s1 = new student();
		s1.roll_no=5;
		s1.name="KaRaN";
		s1.phone="0987654321";
		
		std[0]=s1;
		student s2 = new student();
		s2.roll_no=6;
		s2.name="JAmes";
		s2.phone="1234567890";
		
		std[1]=s2;
		
		for(student ss: std ){
			System.out.println(ss.roll_no+" "+ss.name+"  "+ss.phone);
		}
	}
}