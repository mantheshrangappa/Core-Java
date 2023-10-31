class OrnamentStr{
	
	public static void main(String[] Wallet1){
		
		System.out.println("starting the main in OrnamentStr");
		
	Ornament ornament=new Ornament();
	System.out.println("ornament cost:"+ornament.cost);
	System.out.println("ornament weight:"+ornament.weight);
	System.out.println("ornament quantity:"+ornament.quantity);
	System.out.println("ornament charcter:"+ornament.charcter);
		
		
	Ornament ornament1=new Ornament(54000);
	System.out.println("ornament1 cost:"+ornament1.cost);
	System.out.println("ornament1 weight:"+ornament1.weight);
	System.out.println("ornament1 quantity:"+ornament1.quantity);
	System.out.println("ornament1 charcter:"+ornament1.charcter);
	
	Ornament ornament2=new Ornament(54000,20);
	System.out.println("ornament2 cost:"+ornament2.cost);
	System.out.println("ornament2 weight:"+ornament2.weight);
	System.out.println("ornament2 quantity:"+ornament2.quantity);
	System.out.println("ornament2 charcter:"+ornament2.charcter);
	
	Ornament ornament3=new Ornament(54000,20,5);
	System.out.println("ornament3 cost:"+ornament3.cost);
	System.out.println("ornament3 weight:"+ornament3.weight);
	System.out.println("ornament3 quantity:"+ornament3.quantity);
	System.out.println("ornament3 charcter:"+ornament3.charcter);
	
	Ornament ornament4=new Ornament(54000,20,5,24);
	System.out.println("ornament4 cost:"+ornament4.cost);
	System.out.println("ornament4 weight:"+ornament4.weight);
	System.out.println("ornament4 quantity:"+ornament4.quantity);
	System.out.println("ornament4 charcter:"+ornament4.charcter);
	
	
	System.out.println("starting the main in OrnamentStr");
	}
}