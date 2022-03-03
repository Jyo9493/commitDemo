package overload;

public class Findmax {
	int max(int x,int y) {
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
	}
	double max(double x,double y) {
		if(x>y)
			return x;
		else
			return y;
	}
	char max(char x,char y) {
		if(x>y)
			return x;
		else
			return y;
	}
	public static void main(String[] args) {
		Findmax fmax=new Findmax();
		System.out.println(fmax.max(29, 20));
		System.out.println(fmax.max(45.32, 63.2));
		System.out.println(fmax.max('f', 'F'));
	}
}
