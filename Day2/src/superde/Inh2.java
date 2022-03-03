package superde;
class Customer
{
	String name;
	String email;
	void getCustomerData() {
		name="Jio"; email="jio@hooha.com";
		System.out.println(name+" : "+email);
	}
}
class CreditCustomer extends Customer
{
	String cardName;
	void getCustomerData()//overriding
	{
		super.getCustomerData();//Calling base class method
		cardName="Amex Platinum";
		System.out.println("Card :"+cardName);
	}

}
public class Inh2 {
	public static void main(String[] args) {
		CreditCustomer cs=new CreditCustomer();
		cs.getCustomerData();
	}
}
