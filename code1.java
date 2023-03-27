/**
 * 
 */

/**
 * @author ASUS
 *
 */
import java.util.Scanner;
public class code1{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		if(age<18) {
			System.out.println("you are still a minor.Please grow up!!1");
		}
		else if(age>65) {
			System.out.println("you are a senior citizen.Stop over expectations");
		}
		else {
			System.out.println("congratulation you are in the list of most eligible grooms");
		}
	}

}
