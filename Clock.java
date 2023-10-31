class Clock{
	
	int noofstick;
	String brand;
	int noofhouer;
	double cost;
	
	Clock(){
		
		super();
	}
	
	Clock(int noofstick){
		super();
		this.noofstick=noofstick;
		System.out.println("clock noofstick:"+noofstick);
	}
	
	Clock(int noofstick,String brand){
		super();
		this.noofstick=noofstick;
		this.brand=brand;
		System.out.println("clock noofstick:"+noofstick+","+brand);
	}
	
	Clock(int noofstick,String brand,int noofhouer){
		super();
		this.noofstick=noofstick;
		this.brand=brand;
		this.noofhouer=noofhouer;
		System.out.println("clock noofstick:"+noofstick+","+brand+","+noofhouer);
	}
	
	Clock(int noofstick,String brand,int noofhouer,double cost){
		super();
		this.noofstick=noofstick;
		this.brand=brand;
		this.noofhouer=noofhouer;
		this.cost=cost;
		System.out.println("clock noofstick:"+noofstick+","+brand+","+noofhouer+","+cost);
	}
	
}