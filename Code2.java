/**
 * 
 */

/**
 * @author ASUS
 *
 */
import java.util.Scanner;
public class Code2{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++) {
				System.out.print("@");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("$");
				}
			System.out.println();			
			}
		}
	}
