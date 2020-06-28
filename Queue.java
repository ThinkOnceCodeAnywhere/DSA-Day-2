import java.util.Scanner;
public class Queue
{ 
    static Node head; 
    static Node last;
    static Node temp;
    
    static class Node 
    { 
        int data; 
        Node next; 
    }
    
    public static Queue enqueue(Queue list, int data) 
    { 
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        if (list.head == null) 
        { 
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
    
    public static Queue dequeue(Queue list) 
    {	
    	if(list.head == null)
    		System.out.println("Queue is empty");
    	else
    	{
    		System.out.println("The Dequeued element is : "+list.head.data);
    		list.head = list.head.next;
    	}	 
    	return list;
    }
    
    public static void print(Queue list) 
    { 
        if(list.head == null)
        	System.out.println("Queue is empty");
        while (list.head != null) 
        { 
            System.out.print(list.head.data + " "); 
            list.head = list.head.next; 
        } 
    }
    
    public static void main(String[] args) 
    { 
        Queue list = new Queue();
		Scanner sc = new Scanner(System.in);
		while(true)
		{ 
			System.out.println("Enter your choice:");
			System.out.println("1.Push | 2.Pop | 3.Print");
			int choice = sc.nextInt();
			switch(choice) 
			{
				case 1: System.out.println("Enter a value for the list:");
						int data = sc.nextInt();
						if(data != 0)
							list = enqueue(list,data);
						break;
				case 2: list = dequeue(list);
						break;
				case 3: System.out.println("The Queue is: ");
						print(list);
						break;
				default: System.out.println("Program Terminated"); 
						break;
			}
		}	
    } 
} 