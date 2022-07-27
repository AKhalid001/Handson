import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) 
    {
        int n, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        System.out.println("Enter search elements:");
        x = s.nextInt();
		int index = -1;
		

		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				index = i + 1;
				break;
			}
		}

		System.out.println("At position :" + index);
	}

}
