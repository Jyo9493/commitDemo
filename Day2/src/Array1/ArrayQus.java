package Array1;
import java.util.Scanner;
public class ArrayQus {
	public static void main(String[] args) {
		String []fruits=new String[5];
		System.out.println("Enter any 5 fruits");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			fruits[i]=sc.next();
		}
		/*for(int i=0;i<5;i++) {
			System.out.println(fruits[i]);
		}*/
		for(String f: fruits)
			System.out.println(f);
	}

}
