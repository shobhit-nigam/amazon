#include<stdio.h>
#include<unistd.h>

void main()
	{
	int varx = 23;
	int pid=0, ppid=0;
	pid = getpid();
	ppid = getppid();
	printf("%d will sleep now\n", pid);
	printf("%d is the parent\n", ppid);
	sleep(30);
	printf("got up will exit now\n");
	}
