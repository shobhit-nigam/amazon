#include<stdio.h>
#include<unistd.h>

void main()
	{
	int varx = 23;
	int a = 10;
	a = fork();
	if(a==0)
		{
		printf("am the child\n");
		printf("my pid = %d\n", getpid());
		}
	else
		{
		sleep(1);		
		printf("am the parent\n");
		printf("my pid = %d\n", getpid());
		}
	printf("last line\n");
	}
