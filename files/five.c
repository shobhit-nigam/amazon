#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

void main()
	{
	int fda=0, fdb=0;	
	static char buf[20];
	fda = open("ironman", O_RDONLY);
	read(fda, buf , 4);
	printf("read data is %s\n", buf);
	printf("fda = %d\n", fda);
	fdb = open("hulk", O_WRONLY|O_CREAT, 0644);
	printf("fdb = %d\n", fdb);
	write(fdb, buf, 3);
	write(1, buf, 3);
	write(1, "\n", 1);
	close(fda);	close(fdb);
	}

//stdin		0
//stdout	1
//stderr	2
//ironman	3
