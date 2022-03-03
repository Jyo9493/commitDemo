package inheritance;
class Bank//Parent /Base /Super
{
	void deposit() {
		System.out.println("Deposits");
	}
	void withdraw() {
		System.out.println("Withdraws Money");
	}
}
class ICICI extends Bank //child /desrived /subclass
{
	void setInterest() {
		System.out.println("Interest Rate is 9.87");
	}
}

public class Inhe {
	public static void main(String[] args) {
		ICICI chn1=new ICICI();
		chn1.deposit();
		chn1.withdraw();
		chn1.setInterest();
	}

}
