import java.util.Scanner;

public class SinglyLL {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	public void addition() {
		int data,n;
		do {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the data");
		data=scan.nextInt();
		Node newnode=new Node(data);
		if (head==null) {
			head=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
		System.out.println("If u want to continue then press 1");
		n=scan.nextInt();
		}
		while(n==1);
	}
	public void traverse() {
		Node temp=head;
		if (head==null) {
			System.out.println("There is no linked list");
		}
		else {
			while (temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
	}
	public static void main(String[] args) {
		SinglyLL ll=new SinglyLL();
		ll.addition();
		ll.traverse();
	}

}
