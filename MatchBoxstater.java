class MatchBoxstater{
	
	public static void main(String[] maychbox){
		
		System.out.println("starting the main of maxchbox");
		
		MatchBox matchBox;
		matchBox=new MatchBox();
		System.out.println("matchBox brand:"+matchBox.brand);
		System.out.println("matchBox type:"+matchBox.type);
		System.out.println("matchBox noofstick:"+matchBox.noofstick);
		System.out.println("matchBox price:"+matchBox.price);
		System.out.println("matchBox length:"+matchBox.length);
		System.out.println("matchBox weight:"+matchBox.weight);
		
		MatchBox matchBox1=new MatchBox("patna");
		System.out.println("matchBox1 brand:"+matchBox1.brand);
		System.out.println("matchBox1 type:"+matchBox1.type);
		System.out.println("matchBox1 noofstick:"+matchBox1.noofstick);
		System.out.println("matchBox1 price:"+matchBox1.price);
		System.out.println("matchBox1 length:"+matchBox1.length);
		System.out.println("matchBox1 weight:"+matchBox1.weight);
		
		
		MatchBox matchBox2=new MatchBox("patna","fire");
		System.out.println("matchBox2 brand:"+matchBox2.brand);
		System.out.println("matchBox2 type:"+matchBox2.type);
		System.out.println("matchBox2 noofstick:"+matchBox2.noofstick);
		System.out.println("matchBox1 price:"+matchBox2.price);
		System.out.println("matchBox2 length:"+matchBox2.length);
		System.out.println("matchBox2 weight:"+matchBox2.weight);
		
		
		MatchBox matchBox3=new MatchBox("patna","fire",100);
		System.out.println("matchBox3 brand:"+matchBox3.brand);
		System.out.println("matchBox3 type:"+matchBox3.type);
		System.out.println("matchBox3 noofstick:"+matchBox3.noofstick);
		System.out.println("matchBox3 price:"+matchBox3.price);
		System.out.println("matchBox3 length:"+matchBox3.length);
		System.out.println("matchBox3 weight:"+matchBox3.weight);
		
		
		MatchBox matchBox4=new MatchBox("patna","fire",100,1);
		System.out.println("matchBox4 brand:"+matchBox4.brand);
		System.out.println("matchBox4 type:"+matchBox4.type);
		System.out.println("matchBox4 noofstick:"+matchBox4.noofstick);
		System.out.println("matchBox4 price:"+matchBox4.price);
		System.out.println("matchBox4 length:"+matchBox4.length);
		System.out.println("matchBox4 weight:"+matchBox4.weight);
		
		
		MatchBox matchBox5=new MatchBox("patna","fire",100,1,2);
		System.out.println("matchBox5 brand:"+matchBox5.brand);
		System.out.println("matchBox5 type:"+matchBox5.type);
		System.out.println("matchBox5 noofstick:"+matchBox5.noofstick);
		System.out.println("matchBox5 price:"+matchBox5.price);
		System.out.println("matchBox5 length:"+matchBox5.length);
		System.out.println("matchBox5 weight:"+matchBox5.weight);
		
		
		MatchBox matchBox6=new MatchBox("patna","fire",100,1,2,10);
		System.out.println("matchBox6 brand:"+matchBox6.brand);
		System.out.println("matchBox6 type:"+matchBox6.type);
		System.out.println("matchBox6 noofstick:"+matchBox6.noofstick);
		System.out.println("matchBox6 price:"+matchBox6.price);
		System.out.println("matchBox6 length:"+matchBox6.length);
		System.out.println("matchBox6 weight:"+matchBox6.weight);
		
		System.out.println("ending the main of maxchbox");
	}
}