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
		sleep(20);
		printf("my pid=%d\n", getpid());
		printf("my ppid=%d\n", getppid());
		}
	else
		{		
		printf("am the parent\n");
		sleep(20);
		printf("my pid = %d\n", getpid());
		printf("my ppid=%d\n", getppid());
		}
	printf("last line\n");
	}
