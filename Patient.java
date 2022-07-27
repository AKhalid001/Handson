import java.util.*;  
public class Patient {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);     
		System.out.print("Enter the name of the Patient ");  
		String str= sc.nextLine();        
		System.out.print("Enter the weight in kg"); 
		int a = sc.nextInt();
		System.out.print("Enter the height in meter");
		int b = sc.nextInt();
		double BMI = a/(b*b);
		System.out.println("Mr."+str +"'s BMI is "+BMI);
		

	}

}
