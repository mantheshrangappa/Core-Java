class Tent{
	int slno=12;
	Color color;
	double width=4.5;
	double height=5.6;
	
	
	boolean open(){
		System.out.println("this is a open function");
		return false;
	}
	
	boolean close(){
		System.out.println("this is a close function");
		return false;
	}
	
	void showinfo(){
	System.out.println("start the showinfo of tent");
	System.out.println("tent slno:"+slno);
	System.out.println("tent color:"+color);
	System.out.println("tent width:"+width);
	System.out.println("tent height:"+height);
	}
}