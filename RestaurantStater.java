class RestaurantStater{
	public static void main(String[] args){
		System.out.println("start the main in RestaurantStater ");
		String[] values={"egg","rice","gobi","kabba"};
		Restaurant restaurant=new Restaurant(values);
		restaurant.setname("kiran");
		restaurant.showinfo();
		System.out.println("end the main in RestaurantStater ");
		
		System.out.println("start the main in Canteen");
		String[] ute={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","ab","ac","ad","ae","af","ag","ah","ai","as","as","ad","as","df"};
		
		Canteen canteen=new Canteen(ute);
		
		canteen.showinfo();
		
		System.out.println("start the main in Canteen");
		
		
		System.out.println("================================");
		
		String[] name={"canara","vijaya","sbi","hdfc","icici"};
		String[] allacs={"v-gard","bajaj","haire"};
		String[] cctv={"connon","sony","bosch","hikvision","cp plus"};
		
		Atm atm=new Atm(name,allacs,cctv);
		atm.showinfo();
		
		
		
		
		
		
		
		System.out.println("================================");
		
	}
}