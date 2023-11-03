class Xworkzmain{

	public static void main(String args[])
	{
		System.out.println("starting Free in notepadmain");
		Free free0=new Free("java","Because we are campused from college","only for campused students");
		Free free1=new Free("html","Because we are campused from college","only for campused students");
		Free free2=new Free("css","paid 50k","no");
		Free free3=new Free("js","only for 2 months","only for csr students");
		Free free4=new Free("jpa","Because we are campused from college","only for campused students");
		Free free5=new Free("mvc","Because we are campused from college","only for campused students");
		Free free6=new Free("jquery","no free paid 20k","no");
		Free free7=new Free("bootstrap","no free paid 50k","no");
		Free free8=new Free("js","only for 2 months","only for csr students");
		Free free9=new Free("ajax","no free paid 40k","no");
		Free free10=new Free("jdbc","Because we are campused from college","only for campused students");
		Free free11=new Free("servlet","Because we are campused from college","only for campused students");
		free0.displyInfo();
		free1.displyInfo();
		free2.displyInfo();
		free3.displyInfo();
		free4.displyInfo();
		free5.displyInfo();
		free6.displyInfo();
		free7.displyInfo();
		free8.displyInfo();
		free9.displyInfo();
		free10.displyInfo();
		free11.displyInfo();

		
		
		System.out.println("Starting month in main");
		Month month0=new Month("january",31,8,2);
		Month month1=new Month("february",28,6,3);
		Month month2=new Month("march",30,8,2);
		Month month3=new Month("april",31,8,3);
		Month month4=new Month("may",30,8,2);
		Month month5=new Month("june",31,8,2);
		Month month6=new Month("july",30,8,4);
		Month month7=new Month("august",31,8,6);
		Month month8=new Month("september",30,8,2);
		Month month9=new Month("october",31,8,2);
		Month month10=new Month("november",30,8,2);
		Month month11=new Month("june",31,8,6);
		month0.displyInfo();
		month1.displyInfo();
		month2.displyInfo();
		month3.displyInfo();
		month4.displyInfo();
		month5.displyInfo();
		month6.displyInfo();
		month7.displyInfo();
		month8.displyInfo();
		month9.displyInfo();
		month10.displyInfo();
		month11.displyInfo();
		
		System.out.println("Starting course in main");
		Course course0=new Course("sql","js","iot","js","web","python","java");
		Course course1=new Course("sql","java","iot","js","web","js","java");
		Course course2=new Course("sql","js","java","js","web","python","iot");
		Course course3=new Course("web","js","iot","js","sql","python","java");
		Course course4=new Course("sql","js","js","iot","web","python","java");
		Course course5=new Course("sql","js","iot","js","web","java","python");
		Course course6=new Course("sql","js","iot","js","java","python","web");
		Course course7=new Course("js","sol","iot","js","web","python","java");
		Course course8=new Course("sql","js","iot","java","web","python","js");
		Course course9=new Course("web","js","iot","js","sql","python","java");
		Course course10=new Course("sql","python","iot","js","web","js","java");
		Course course11=new Course("sql","js","java","js","web","iot","python");
		
		course0.object();
		course1.object();
		course2.object();
		course3.object();
		course4.object();
		course5.object();
		course6.object();
		course7.object();
		course8.object();
		course9.object();
		course10.object();
		course11.object();
		
		System.out.println("Starting main in TechnologyStarter");
		
		Technology technology=new Technology("Artificial Intelligence","Information Technology",4,"technology","MapReduce","c","html","linux","XMPP","Bootstrap","php","kafka");
		technology.displayInfo();
		
		Technology technology1=new Technology("Cybersecurity"," Security",1,"technology","Python","css","apache","XML","JavaScript","Cocoa","nodejs","DropWizard");
		technology1.displayInfo();
		
		Technology technology2=new Technology("IOT","Internet of things",2,"technology","GFS","c++","JavaScript","MYSQL","YAWS","Python","Html","HDFS");
		technology2.displayInfo();
		
		Technology technology3=new Technology("Cloud","Stroe",5,"technology","BigTable","video Technology","php","machinelearning","mochiweb","Bootstrap","css","Qwartz");
		technology.displayInfo();
		
		Technology technology4=new Technology("Devops","Developing",50,"technology","Kubernetes","VP9","java","AWS","Misultin","NoSQL","SQL","Azkaban");
		technology4.displayInfo();
		
		Technology technology5=new Technology("Robotics","AI",50,"technology","TensorFlow","H.264/MPEG-4","linux","Memecached","Cowboy","Java Kotlin","PHP","Hive");
		technology5.displayInfo();
		
		Technology technology6=new Technology("Automation","IT",50,"technology","Protocol Buffers","AVC video codes","apache","Redis","Riak","Swift","Go","Java");
		technology6.displayInfo();
		
		Technology technology7=new Technology("Full Stack Development","IT",5,"technology"," Spanner","Dynamic adaptive Streaming over http","mysql","Django","Erlang","Objective-C","Ruby","RoR");
		technology7.displayInfo();
		
		Technology technology8=new Technology("BlockChain","IT",50,"technology","java","angular js","HHVM","PostgreSQL","FreeBSD","Angular JS","Javascript","Python");
		technology8.displayInfo();
		
		Technology technology9=new Technology("Bigdata","IT",30,"technology","perl","php","Hack","Gunicorn","Yaws","JQuery","Javascript","PHP");
		technology9.displayInfo();
		
		Technology technology10=new Technology("DataScience","IT",20,"technology","Dijango","html","Haskell","Swift","PHP","Angular js","Node js","Javascript");
		technology10.displayInfo();
		
		Technology technology11=new Technology("Edge Computing","IT",10,"technology","Html","bootstrap","Erlang","css","PHP","GCM","Bootstrap js","HTML");
		technology11.displayInfo();
		
		System.out.println("Starting main in TechnologyStarter");
		
	}
}