class Mainbegin{
	public static void main(String[] args){
		Tent tent=new Tent();
		Agent agent=new Agent();
		agent.openTent(tent);
		agent.closeTent(tent);
		agent.showinfo();
		
	}
}