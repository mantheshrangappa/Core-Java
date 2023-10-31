class MatchBox{
	
	String brand;
	String type;
	double noofstick;
	int price;
	double length;
	double weight;
	
	
	
    MatchBox(){
	System.out.println("creating MatchBox");
	}
	
	MatchBox(String brand){
	this.brand=brand;
	System.out.println("MatchBox brand:"+brand);
	}
	
	MatchBox(String brand,String type){
	this.brand=brand;
	this.type=type;
	
	}
	MatchBox(String brand,String type,double noofstick ){
	this.brand=brand;
	this.type=type;
	this.noofstick=noofstick;

	}
	
	MatchBox(String brand,String type,double noofstick,int price){
	this.brand=brand;
	this.type=type;
	this.noofstick=noofstick;
	this.price=price;

	}
	
	MatchBox(String brand,String type,double noofstick,int price,double length){
	this.brand=brand;
	this.type=type;
	this.noofstick=noofstick;
	this.price=price;
	this.length=length;
	
	}
	
	
	MatchBox(String brand,String type,double noofstick,int price,double length,double weight){
	this.brand=brand;
	this.type=type;
	this.noofstick=noofstick;
	this.price=price;
	this.length=length;
	this.weight=weight;
	
	}
	
}