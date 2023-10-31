class RocketStr{
	
	public static void main(String[] Rocket1){
		
		System.out.println("starting the main of RocketStr");
		
		Rocket rocket=new Rocket();
		System.out.println("rocket name:"+rocket.name);
		System.out.println("rocket cost:"+rocket.cost);
		System.out.println("rocket place:"+rocket.place);
		System.out.println("rocket noofrocket:"+rocket.noofrocket);	
		
		
		Rocket rocket1=new Rocket("l1");
		System.out.println("rocket1 name:"+rocket1.name);
		System.out.println("rocket1 cost:"+rocket1.cost);
		System.out.println("rocket1 place:"+rocket1.place);
		System.out.println("rocket1 noofrocket:"+rocket1.noofrocket);	
		
		
		Rocket rocket2=new Rocket("l1",5600000);
		System.out.println("rocket2 name:"+rocket2.name);
		System.out.println("rocket2 cost:"+rocket2.cost);
		System.out.println("rocket2 place:"+rocket2.place);
		System.out.println("rocket2 noofrocket:"+rocket2.noofrocket);	
		
		
		
		Rocket rocket3=new Rocket("l1",5600000,"haridwara");
		System.out.println("rocket3 name:"+rocket3.name);
		System.out.println("rocket3 cost:"+rocket3.cost);
		System.out.println("rocket3 place:"+rocket3.place);
		System.out.println("rocket3 noofrocket:"+rocket3.noofrocket);	
		
		
		Rocket rocket4=new Rocket("l1",5600000,"haridwara",2);
		System.out.println("rocket4 name:"+rocket4.name);
		System.out.println("rocket4 cost:"+rocket4.cost);
		System.out.println("rocket4 place:"+rocket4.place);
		System.out.println("rocket4 noofrocket:"+rocket4.noofrocket);	
		
		
		System.out.println("ending the main of RocketStr");
		}
}