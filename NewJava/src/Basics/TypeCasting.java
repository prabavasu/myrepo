w 	package Basics;
/*Type  Casting - Primitive data types change one type to another type. 
Two types
Widening Casting 
small to big data type
Narrow Casting                
big to small data type
*/
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a=10;
			//double b=a;//Widening Casting 
            
			double b=a,d=22.073; 
			int c=(int)d;// Narrow Casting
			System.out.println("Integer " +a);
			System.out.println("double " +b);
			System.out.println("double " +d);
			System.out.println("int " +c);


	}

}
