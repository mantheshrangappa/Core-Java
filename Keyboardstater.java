class Keyboardstater{
	
	public static void main(String[] Keyboard){
		
		System.out.println("starting the main of keyboardstater");
		
		
		Keyboard keyboard;
		
		keyboard=new Keyboard();
		System.out.println("Keyboard brand:"+keyboard.brand);
		System.out.println("Keyboard color:"+keyboard.color);
		System.out.println("Keyboard noofkeys:"+keyboard.noofkeys);
		System.out.println("Keyboard type:"+keyboard.type);
		System.out.println("Keyboard cost:"+keyboard.cost);
		
		Keyboard keyboard1=new Keyboard("acer");
		System.out.println("Keyboard1 brand:"+keyboard1.brand);
		System.out.println("Keyboard1 color:"+keyboard1.color);
		System.out.println("Keyboard1 noofkeys:"+keyboard1.noofkeys);
		System.out.println("Keyboard1 type:"+keyboard1.type);
		System.out.println("Keyboard1 cost:"+keyboard1.cost);
		
		Keyboard keyboard2=new Keyboard("hp","red");
		System.out.println("Keyboard2 brand:"+keyboard2.brand);
		System.out.println("Keyboard2 color:"+keyboard2.color);
		System.out.println("Keyboard2 noofkeys:"+keyboard2.noofkeys);
		System.out.println("Keyboard2 type:"+keyboard2.type);
		System.out.println("Keyboard2 cost:"+keyboard2.cost);
		
		Keyboard keyboard3=new Keyboard("hp","red",104);
		System.out.println("Keyboard3 brand:"+keyboard3.brand);
		System.out.println("Keyboard3 color:"+keyboard3.color);
		System.out.println("Keyboard3 noofkeys:"+keyboard3.noofkeys);
		System.out.println("Keyboard3 type:"+keyboard3.type);
		System.out.println("Keyboard3 cost:"+keyboard3.cost);
		
		Keyboard keyboard4=new Keyboard("hp","red",104,"think pad");
		System.out.println("Keyboard4 brand:"+keyboard4.brand);
		System.out.println("Keyboard4 color:"+keyboard4.color);
		System.out.println("Keyboard4 noofkeys:"+keyboard4.noofkeys);
		System.out.println("Keyboard4 type:"+keyboard4.type);
		System.out.println("Keyboard4 cost:"+keyboard4.cost);
		
		
		Keyboard keyboard5=new Keyboard("hp","red",104,"think pad",2000);
		System.out.println("Keyboard5 brand:"+keyboard5.brand);
		System.out.println("Keyboard5 color:"+keyboard5.color);
		System.out.println("Keyboard5 noofkeys:"+keyboard5.noofkeys);
		System.out.println("Keyboard5 type:"+keyboard5.type);
		System.out.println("Keyboard5 cost:"+keyboard5.cost);
		
		System.out.println("ending the main of keyboardstater");
	
	
		
}
}