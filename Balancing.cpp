#include<bits/stdc++.h>
using namespace std;

class Stack
{
	public:
		char data; 
		Stack * next;
} *head = NULL, *newstack;

void push(Stack **head, char data)
{
	newstack = new Stack();
	newstack -> data = data;
	newstack -> next = NULL;
	
	if(*head == NULL)
		*head = newstack;
	else
	{
		newstack -> next = *head;
		*head = newstack;
	}
}

int pop(char temp, int count)
{
	if((temp == '}' && head -> data == '{')||(temp == ']' && head -> data == '[')||
		(temp == ')' && head -> data == '(') || (temp == '>' && head -> data == '<'))
	{
		if(count > 1)
			*head = *head -> next;
		else
			head = NULL;
	}
	else
	{
		cout << "Not balanced";
		exit(0);
	}
	
}

int main()
{
	int choice;
	char input[10];
	cin >> input;
	int count = 0;
	for(int i = 0; i < strlen(input); i++)
	{
		if(input[i] == '{' || input[i] == '(' || input[i] == '[' || input[i] == '<')
		{
			count++;
			push(&head, input[i]);
		}
		else
		{
			pop(input[i], count);
			count--;
		}
			
	}
	if(count == 0)
		cout << "balanced";
	else
		cout << "Not balanced";
	
}














