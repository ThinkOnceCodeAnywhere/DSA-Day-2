#include<bits/stdc++.h>
using namespace std;

class Stack
{
	public:
		int data;
		Stack * next;
} *head = NULL, *newnode;

void push(Stack **head, int data)
{
	newnode = new Stack();
	newnode -> data = data;
	newnode -> next = NULL;
	
	if(*head == NULL)
		*head = newnode;
	else
	{
		newnode -> next = *head;
		*head = newnode;
	}
}

void pop()
{
	*head = *head -> next;
}

void display(Stack *head)
{
	while(head != NULL)
	{
		cout << head -> data << " ";
		head = head -> next;
	}
}

int main()
{
	int data;
	int choice;
	while(1)
	{
		cout << "Enter choice:"<<endl;
		cin >> choice;
		switch(choice)
		{
		case 1:	cout << "Enter data:"<<endl;
				cin >> data;
				if(data > 0)
					push(&head, data);
				break;
		
		case 2:	pop();
				break;
		default: display(head);
					return 0;
		}
	} 
	
}







