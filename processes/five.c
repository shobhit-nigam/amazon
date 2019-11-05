#include<stdio.h>
#include<unistd.h>

void main()
	{
	int varx = 23;
	varx = getpid();
	printf("namaste pid =%d\n", varx);
	fork();
	varx = getpid();
	printf("adaab pid=%d\n", varx);
	printf("hello\n");
	}
