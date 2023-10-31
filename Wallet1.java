class Wallet1{
	
	String brand;
	String color;
	int totalwallet;
	double cost;
	
	Wallet1(){
	super();
	}
	
	Wallet1(String brand){
	super();
	this.brand=brand;
	System.out.println("wallet1 brand:"+brand);
	}
	
	Wallet1(String brand,String color){
	super();
	this.brand=brand;
	this.color=color;
	System.out.println("wallet1 brand:"+brand+"."+color);
	}
	
	
	Wallet1(String brand,String color,int totalwallet){
	super();
	this.brand=brand;
	this.color=color;
	this.totalwallet=totalwallet;
	System.out.println("wallet1 brand:"+brand+"."+color+","+totalwallet);
	}
	
	Wallet1(String brand,String color,int totalwallet,double cost){
	super();
	this.brand=brand;
	this.color=color;
	this.totalwallet=totalwallet;
	this.cost=cost;
	System.out.println("wallet1 brand:"+brand+"."+color+","+totalwallet+","+cost);
	}
}