public class Employee {

 int i=5;

 void disp()

 {

 int i=10;

 System.out.println(i);

 System.out.println(this.i);

 }

 public static void main(String[] args) {

 Employee ob=new Employee();

 ob.disp();

 }

}