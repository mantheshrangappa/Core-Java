class Restaurant{
	String ownerName;
	String[] specialitems;
	
	
	
	
	Restaurant(String[] specialitems){
		this.specialitems=specialitems;
	}
	
	void setname(String ownerName){
		this.ownerName=ownerName;
	}
	
	void showinfo(){
		System.out.println("start the showinfo in Restaurant");
		System.out.println("ownerName:"+this.ownerName);		
		System.out.println("specialitems:"+this.specialitems);	
			if(this.specialitems!=null){
				for(int i=0; i<this.specialitems.length; i++){
					String ref=this.specialitems[i];
					System.out.println("ref:"+ref);
				}
			}
		
		System.out.println("end the showinfo in Restaurant");
	}
}