
import java.util.Scanner;
public class Stack
{ 
    static Node head; 
    static Node last;
    static Node temp;
    
    static class Node 
    { 
        int data; 
        Node next; 
    }
    
    public static Stack push(Stack list, int data) 
    { 
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        if (list.head == null) { 
            list.head = new_node;
            list.last = new_node;
        } 
        else 
        {  
            list.last.next = new_node;
            list.last = new_node;
        } 
        return list; 
    }
    
    public static Stack pop(Stack list) 
    {
    	list.temp = head;
    	if(list.head == list.last)
    		list.head = null;
    	
    	if(list.temp == null)
    		System.out.println("Stack is empty");  	
    	else 
    	{
	    	while(list.temp.next != null) 
	    	{
	    		list.last = list.temp;
	    		list.temp = list.temp.next;
	    	}
	    	list.last.next = null;
	    	System.out.println("The popped element is : "+list.temp.data); 
	    }
    	return list;
    }
    
    public static void print(Stack list) 
    { 
        if(list.head == null)
        	System.out.println("Stack is empty");
        while (list.head != null) 
        { 
            System.out.print(list.head.data + " "); 
            list.head = list.head.next; 
        } 
    }
    
    public static void main(String[] args) 
    { 
        Stack list = new Stack();
		Scanner sc = new Scanner(System.in);
		while(true)
		{ 
			System.out.println("Enter your choice:");
			System.out.println("1.Push | 2.Pop | 3.Print");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter a value for the list:");
					int data = sc.nextInt();
					if(data != 0)
						list = push(list,data);
					break;
			case 2: list = pop(list);
					break;
			case 3: System.out.println("The stack is: ");
					print(list);
					break;
			default: System.out.println("Program Terminated"); 
					break;
			}
			
		}	
    } 
} 