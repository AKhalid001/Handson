class A

{

 final void disp()

 {

 System.out.println("display method");

 }

}

public class FIRST extends A

{

final double pi;

FIRST()

 {

 pi=3.144;

 }

 void A.disp()

 {

 //pi=3.22;

 System.out.println(pi);

 }

 public static void main(String[] args) {

 FIRST ob=new FIRST();

 ob.disp();

 }

}















