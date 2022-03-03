package encapsulation;

public class ManageEmployee {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setPsno("PS001");
		e.setFirstName("Radha");
		e.setJobTitle("Pat");
		System.out.println(e.getPsno());
		System.out.println(e.getFirstName());
		System.out.println(e.getJobTitle());
	}

}
