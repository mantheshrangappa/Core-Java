class Canteen{
	String type="non-veg";
	String[] utensils;
	  
	Canteen(String[] utensils){
		this.utensils=utensils;
	}  
	
	void showinfo(){
		System.out.println("start showinfo in Canteen");
		System.out.println("type:"+this.type);
		System.out.println("utensils:"+this.utensils);
		if(this.utensils!=null){
			for(int i=0; i<this.utensils.length; i++){
				String ref=this.utensils[i];
				System.out.println("ref:"+ref);
			}
		}
		System.out.println("end showinfo in Canteen");
	}
	
}