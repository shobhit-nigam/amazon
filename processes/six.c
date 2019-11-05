#include<stdio.h>
#include<unistd.h>

void main()
	{
	int varx = 23;
	int a = 0;
	varx = getpid();
	printf("namaste pid =%d\n", varx);
	a = fork();
	varx = getpid();
	printf("adaab pid=%d and a=%d\n", varx, a);
	printf("hello\n");
	}
