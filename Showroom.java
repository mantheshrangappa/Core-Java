class Showroom{
	
	String name;
	String type;
	String ceo;
	String dimension;
	String brand;
	int noofBranches;
	double profit;
	int noofVehicles;
	
	Showroom(){
		
		System.out.println("creating a Showroom");
	}
	
	Showroom(String name){
		
		this.name=name;
	}
	
	Showroom(String name,String type){
		
		this.name=name;
		this.type=type;
	}
	
	Showroom(String name,String type,String ceo){
		
		this.name=name;
		this.type=type;
		this.ceo=ceo;
	}
	
	Showroom(String name,String type,String ceo,String dimension){
		
		this.name=name;
		this.type=type;
		this.ceo=ceo;
		this.dimension=dimension;
	}
	
		
	Showroom(String name,String type,String ceo,String dimension,String brand){
		
		this.name=name;
		this.type=type;
		this.ceo=ceo;
		this.dimension=dimension;
		this.brand=brand;
	}
	
	Showroom(String name,String type,String ceo,String dimension,String brand,int noofBranches){
		
		this.name=name;
		this.type=type;
		this.ceo=ceo;
		this.dimension=dimension;
		this.brand=brand;
		this.noofBranches=noofBranches;
	}
	
	Showroom(String name,String type,String ceo,String dimension,String brand,int noofBranches,double profit){
		
		this.name=name;
		this.type=type;
		this.ceo=ceo;
		this.dimension=dimension;
		this.brand=brand;
		this.noofBranches=noofBranches;
		this.profit=profit;
	}
	
	Showroom(String name,String type,String ceo,String dimension,String brand,int noofBranches,double profit,int noofVehicles){
		
		this.name=name;
		this.type=type;
		this.ceo=ceo;
		this.dimension=dimension;
		this.brand=brand;
		this.noofBranches=noofBranches;
		this.profit=profit;
		this.noofVehicles=noofVehicles;
	}
	
}
	