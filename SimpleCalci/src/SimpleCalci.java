import java.lang.*;
import java.util.Scanner;

abstract class Solutions{
	abstract void getResult(int a,int b);
}

class Add extends Solutions{
	void getResult(int a,int b){
		System.out.println("Addition Solution="+(a+b));
	}
}

class Subtract extends Solutions{
	void getResult(int a,int b){
		System.out.println("Subtraction Solution="+(a-b));
	}
}

class Multiply extends Solutions{
	void getResult(int a,int b){
		System.out.println("Multiplication Solution="+(a*b));
	}
}

class Division extends Solutions{
	void getResult(int a,int b){
		System.out.println("Division Solution="+(a/b));
	}
}

public class SimpleCalci {

		public static void main(String args[]){
			Solutions s;
			Scanner input=new Scanner(System.in);
			System.out.println("Enter 1.Addition 2.Subtraction 3.Multiplication 4.Division");
			int m=input.nextInt();
			System.out.print("a=");
			int a=input.nextInt();
			System.out.print("b=");
			int b=input.nextInt();
			if (m==1){
				s=new Add();
				s.getResult(a,b);
			}
			else if(m==2){
				s=new Subtract();
				s.getResult(a,b);
			}
			else if(m==3){
				s=new Multiply();
				s.getResult(a,b);
			}
			else if(m==4){
				s=new Division();
				s.getResult(a,b);
			}

	}

}
