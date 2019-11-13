#include<stdio.h>
#include<unistd.h>
void main()
	{
	int pd[2], i=0;
	static char buf[20];
	pipe(pd);
	i = fork();
	if(i==0)
		{
		close(pd[0]);
		printf("child will write\n");
		write(pd[1], "last day", 8);
		printf("child has written\n");
		}
	else
		{
		close(pd[1]);
		printf("parent will read\n");
		read(pd[0], buf, 8);
		printf("parent has read %s\n", buf);
		}			
	}
