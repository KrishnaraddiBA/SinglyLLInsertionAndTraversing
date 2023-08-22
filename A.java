import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		boolean flag=true;
		while(flag) {
		System.out.println("press 1 to add element in an array");
		System.out.println("Press2 for remove elements in an array");
		System.out.println("Press other keys to exit");
		
		int key=scan.nextInt();
		switch (key) {
		case 1:
			System.out.println("Enter the index u want to add the value");
			int index=scan.nextInt();
			System.out.println("Enter the value u want to insert the value");
			int value=scan.nextInt();
			
			addElement(index, value);
			break;
		case 2:
			System.out.println("Enter the index u want to delete an value");
			index=scan.nextInt();
			removeValues(index);
			
			break;

		default:
			System.out.println("Thanku!!!");
			flag=false;
			break;
		}
		
		
		
		
		}
	}

	public static void removeValues(int index) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array u insert");
		
		int n=scan.nextInt();
		int []a=new int[n];
		int []b=new int[n-1];
		System.out.println("Insert the values in an array!!!");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if(i<index) {
				b[i]=a[i];
			}
			else if (i==index) {
				continue;
			}
			else {
				b[i-1]=a[i];
			}
		
			
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}

	public static void addElement(int index, int value) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n =scan.nextInt();
		int []a=new int[n];
		int []b=new int[n+1];
		System.out.println("Enter the values in an array");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		
		for (int i = 0; i < b.length; i++) {
			if (i<index) {
				b[i]=a[i];
			}
			else if (i==index) {
				b[i]=value;
			}
			else {
				b[i]=a[i-1];
			}
			System.out.println(b[i]);
		}
		
	}
	
	

}
