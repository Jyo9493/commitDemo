package construct;

public class product2 {
	int price,qty,total;
	product2() {
		price=100;
		qty=3;
	}
	product2(int prc,int quantity){
		this.price=prc;
		this.qty=quantity;
	}
	void findTotal() {
		total=price*qty;
		System.out.println("Bill Amount is "+total);
	}
		public static void main(String[] args) {
		product2 soap=new product2();
		soap.findTotal();
		product2 soap1=new product2(20,5);
		soap1.findTotal();
}
}


