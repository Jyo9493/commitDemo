package Array1;
class Employee{
	private String empid;
	private String fname;
	public Employee(String empid, String fname) {
		this.empid = empid;
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fname=" + fname + "]";
	}
}
public class ManageEmployee {
	public static void main(String[] args) {
		Employee []emps=new Employee[2];
		emps[0]=new Employee("E0001","Rasmi");
		emps[1]=new Employee("E0003","Ravan");
		System.out.println(emps[0]);
		System.out.println(emps[1]);
	}
}
