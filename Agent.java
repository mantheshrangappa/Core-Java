class Agent{
	int id=101;
	String name="mntha";
	String company="infosys";
	Tent tent;
	
	void openTent(Tent tent){
		this.tent=tent;
		System.out.println("slno:"+tent.slno);
		System.out.println("width:"+tent.width);
		System.out.println("height:"+tent.height);
		System.out.println("color:"+tent.color);
	}
	
	void closeTent(Tent tent){
		this.tent=tent;
		System.out.println("slno:"+tent.slno);
		System.out.println("width:"+tent.width);
		System.out.println("height:"+tent.height);
		System.out.println("color:"+tent.color);
}

void showinfo(){
	openTent(tent);
	closeTent(tent);
	
}
}