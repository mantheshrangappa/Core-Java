class Course{
	String java;
	String web;
	String python;
	String  sql;
	String dbms;
	String js;
	String iot;
	
	Course(String java,String web,String python,String  sql,String dbms,String js,String iot){
		
		this.java=java;
		this.web=web;
		this.python=python;
		this.dbms=dbms;
		this.sql=sql;
		this.js=js;
		this.iot=iot;
	}
	
	void object(){
		System.out.println("course java"+java);
		System.out.println("course web"+web);
		System.out.println("course python"+python);
		System.out.println("course dbms"+dbms);
		System.out.println("course sql"+sql);
		System.out.println("course js"+js);
		System.out.println("course iot"+iot);
	}
}