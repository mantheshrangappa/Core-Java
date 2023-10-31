class Rocket{
	
	String name;
	double cost;
	String place;
	int noofrocket;
	
	Rocket(){
		super();
	}
	
	Rocket(String name){
		super();
		this.name=name;
		System.out.println("rocket name:"+name);
	}
		
	Rocket(String name,double cost){
		super();
		this.name=name;
		this.cost=cost;
		System.out.println("rocket name:"+name+","+cost);
	}
	
	Rocket(String name,double cost,String place){
		super();
		this.name=name;
		this.cost=cost;
		this.place=place;
		System.out.println("rocket name:"+name+","+cost+","+place);
	}
	
	Rocket(String name,double cost,String place,int noofrocket){
		super();
		this.name=name;
		this.cost=cost;
		this.place=place;
		this.noofrocket=noofrocket;
		System.out.println("rocket name:"+name+","+cost+","+place+","+noofrocket);
	}
}