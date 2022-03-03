package construct;

public class Product1 {
	int price,qty,total;
	Product1(){
		price=100;
		qty=3;
	}
	Product1(int prc,int quantity){
		price=prc;
		qty=quantity;
	}
	void findTotal() {
		total=price*qty;
		System.out.println("Bill Amount is "+total);
	}
		public static void main(String[] args) {
		Product1 soap=new Product1();
		soap.findTotal();
		Product1 soap1=new Product1();
		soap1.findTotal();
}
}