package Test;

 class LeapYear {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int input=2016;
	//	System.out.println("enter the year");
	//	int input=sc.nextInt();
		
		if(input%4==0) {
			
			if(input%100==0 )
				{
				if (input%400==0) {
					System.out.println("its a leap year");
				}
			}
		}
				else {
			System.out.println("not a leap year");
		}
				else {
					System.out.println("not a leap year");
				}
				else {
					System.out.println("not a leap year");
				}
	}

}



