class Ornament{
	
	double cost;
	double weight;
	int quantity;
	int charcter;
	
	
	Ornament(){
		super();
	}
	
	Ornament(double cost){
		super();
		this.cost=cost;
		System.out.println("Ornament cost:"+cost);
	}
	
	
	Ornament(double cost,double weight){
		super();
		this.cost=cost;
		this.weight=weight;
		System.out.println("Ornament cost:"+cost+","+weight);
	}
	
	Ornament(double cost,double weight,int quantity){
		super();
		this.cost=cost;
		this.weight=weight;
		this.quantity=quantity;
		System.out.println("Ornament cost:"+cost+","+weight+","+quantity);
	}
	
	Ornament(double cost,double weight,int quantity,int charcter){
		super();
		this.cost=cost;
		this.weight=weight;
		this.quantity=quantity;
		this.charcter=charcter;
		System.out.println("Ornament cost:"+cost+","+weight+","+quantity+","+charcter);
	}
}