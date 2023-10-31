class Wallet1Str{

public static void main(String[] Wallet1){
	
	Wallet1 wallet1=new Wallet1();
	System.out.println("wallet1 brand:"+wallet1.brand);
	System.out.println("wallet1 color:"+wallet1.color);
	System.out.println("wallet1 totalwallet:"+wallet1.totalwallet);
	System.out.println("wallet1 cost:"+wallet1.cost);
	
	Wallet1 wallet11=new Wallet1("puma");
	System.out.println("wallet11 brand:"+wallet11.brand);
	System.out.println("wallet11 color:"+wallet11.color);
	System.out.println("wallet11 totalwallet:"+wallet11.totalwallet);
	System.out.println("wallet11 cost:"+wallet11.cost);
	
	Wallet1 wallet12=new Wallet1("puma","red");
	System.out.println("wallet12 brand:"+wallet12.brand);
	System.out.println("wallet12 color:"+wallet12.color);
	System.out.println("wallet12 totalwallet:"+wallet12.totalwallet);
	System.out.println("wallet12 cost:"+wallet12.cost);
	
	Wallet1 wallet13=new Wallet1("puma","red",4);
	System.out.println("wallet13 brand:"+wallet13.brand);
	System.out.println("wallet13 color:"+wallet13.color);
	System.out.println("wallet13 totalwallet:"+wallet13.totalwallet);
	System.out.println("wallet13 cost:"+wallet13.cost);
	
	Wallet1 wallet14=new Wallet1("puma","red",4,150);
	System.out.println("wallet14 brand:"+wallet14.brand);
	System.out.println("wallet14 color:"+wallet14.color);
	System.out.println("wallet14 totalwallet:"+wallet14.totalwallet);
	System.out.println("wallet14 cost:"+wallet14.cost);
}
}