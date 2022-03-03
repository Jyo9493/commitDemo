package Array1;
import java.util.Scanner;
class Emplo{
	private String empid;
	private String fname;
	public Emplo(String empid, String fname) {
		this.empid = empid;
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fname=" + fname + "]";
	}
	
}
public class EmployeeObj {
	public static void main(String[] args) {
		int rec;
		String emp,nam;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Employees");
		rec=sc.nextInt();
		Emplo []emp1=new Emplo[rec];
		for(int i=0;i<rec;i++) {
			System.out.println("Enter EmpId:");
			emp=sc.next();
			System.out.println("Enter Name:");
			nam=sc.next();
			emp1[i]=new Emplo(emp,nam);
		}
		for(Emplo em:emp1) {
			System.out.println(em);
		}
		
	}

}
