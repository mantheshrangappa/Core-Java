class Keyboard{
	
	String brand;
	String color;
	double noofkeys;
	String type;
	double cost;
	
	
    Keyboard(){
	System.out.println("creating keyboard");
	}
	
	Keyboard(String brand){
	this.brand=brand;
	System.out.println("keyboard brand:"+brand);
	}
	
	Keyboard(String brand,String color){
	this.brand=brand;
	this.color=color;
	System.out.println("keyboard brand:"+brand+"color");
	}
	Keyboard(String brand,String color,double noofkeys ){
	this.brand=brand;
	this.color=color;
	this.noofkeys=noofkeys;
	System.out.println("keyboard brand:"+brand+"color"+"noofkeys");
	}
	
	Keyboard(String brand,String color,double noofkeys,String type){
	this.brand=brand;
	this.color=color;
	this.noofkeys=noofkeys;
	this.type=type;
	System.out.println("keyboard brand:"+brand+"color"+"noofkeys"+"type");
	}
	
	Keyboard(String brand,String color,double noofkeys,String type,double cost){
	this.brand=brand;
	this.color=color;
	this.noofkeys=noofkeys;
	this.type=type;
	this.cost=cost;
	System.out.println("keyboard brand:"+brand+"color"+"noofkeys"+"type"+"cost");
	}
	
	
	}