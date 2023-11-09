class Atm{
	String bankname="cannara";
	String[] branch;
	String[] acs;
	String[] cctvBrand;
	
	Atm(String[] branch,String[] acs,String[] cctvBrand){
	this.branch=branch;
	this.acs=acs;
	this.cctvBrand=cctvBrand;
	}
	
	void showinfo(){
		System.out.println("start the showinfo in Atm");
		System.out.println("bankname:"+this.bankname);
		System.out.println("branch:"+this.branch);
		if(this.branch!=null){
			for(int i=0; i<this.branch.length; i++){
				String ref=this.branch[i];
				System.out.println("ref:"+ref);
				
			}
		}
		
		System.out.println("acs:"+this.acs);
		if(this.acs!=null){
			for(int i=0; i<this.acs.length; i++){
				String seq=this.acs[i];
				System.out.println("seq:"+seq);
				
			}
		}
		
		System.out.println("cctvBrand:"+this.cctvBrand);
		if(this.cctvBrand!=null){
			for(int i=0; i<this.cctvBrand.length; i++){
				String re=this.cctvBrand[i];
				System.out.println("re:"+re);
				
			}
		}
		
		
		System.out.println("start the showinfo in Atm");
	}
}