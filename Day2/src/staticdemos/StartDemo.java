package staticdemos;

public class StartDemo {
	static int x;// Global or class variable
	public static void main(String[] args) {
		StartDemo s1=new StartDemo();
		StartDemo s2=new StartDemo();
		StartDemo s3=new StartDemo();
		s1.x=200;//illegal call
		s2.x=300;//illegal call
		 System.out.println(s1.x);//illegal call
		 System.out.println(s2.x);//illegal call
		 System.out.println(s3.x);//illegal call
		 
		 System.out.println(StartDemo.x);//legal call of static variable
		 System.out.println(x);//legal call of static varaible
	}

}
