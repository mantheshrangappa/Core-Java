class Clockstarter{
	
	public static void main(String[] Clockstarter){
		
		System.out.println("starting the main of Clockstarter");
		
		Clock clock=new Clock();
		System.out.println("clock noofstick:"+clock.noofstick);
		System.out.println("clock brand:"+clock.brand);
		System.out.println("clock noofhouer:"+clock.noofhouer);
		System.out.println("clock cost:"+clock.cost);
		
		Clock clock1=new Clock(3);
		System.out.println("clock1 noofstick:"+clock1.noofstick);
		System.out.println("clock1 brand:"+clock1.brand);
		System.out.println("clock1 noofhouer:"+clock1.noofhouer);
		System.out.println("clock1 cost:"+clock1.cost);
		
		Clock clock2=new Clock(3,"fasttrak");
		System.out.println("clock2 noofstick:"+clock2.noofstick);
		System.out.println("clock2 brand:"+clock2.brand);
		System.out.println("clock2 noofhouer:"+clock2.noofhouer);
		System.out.println("clock2 cost:"+clock2.cost);
		
		Clock clock3=new Clock(3,"fasttrak",12);
		System.out.println("clock3 noofstick:"+clock3.noofstick);
		System.out.println("clock3 brand:"+clock3.brand);
		System.out.println("clock3 noofhouer:"+clock3.noofhouer);
		System.out.println("clock3 cost:"+clock3.cost);
		
		Clock clock4=new Clock(3,"fasttrak",12,500);
		System.out.println("clock4 noofstick:"+clock4.noofstick);
		System.out.println("clock4 brand:"+clock4.brand);
		System.out.println("clock4 noofhouer:"+clock4.noofhouer);
		System.out.println("clock4 cost:"+clock4.cost);
		
		
		
		System.out.println("ending the main of Clockstarter");
	}
}