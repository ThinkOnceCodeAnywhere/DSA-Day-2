#include<bits/stdc++.h>
using namespace std;

class Queue
{
	public:
		int data;
		Queue * next;
} *head = NULL, *temp , *newnode;

void enqueue(Queue **head, int data)
{
	newnode = new Queue();
	newnode-> data = data;
	newnode -> next = NULL;
	
	if(*head == NULL)
	{
		*head = newnode;
		temp = newnode;
	}
	else
	{
		temp -> next = newnode;
		temp = newnode;
	}
}

void dequeue()
{
	if(head -> next != NULL)
		head = head -> next;
}

void display(Queue * head)
{
	while(head != NULL)
	{
		cout << head -> data << " ";
		head = head -> next;
	}
}

int main()
{
	int data, choice;
	while(1)
	{
		cout << "Enter your choice:" << endl;
		cin >> choice;
		
		switch(choice)
		{
			case 1: cout << "Enter the data" << endl;
					cin >> data;
					if(data > 0)
						enqueue(&head, data);
					break;
					
			case 2: dequeue();
					break;
					
			case 3: display(head);
					cout << endl;
					break;
					
			default: return 0;
		}
	}
}















