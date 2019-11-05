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
//	read(fda, buf , 6);
//	printf("read data is %s\n", buf);
	close(fda);
	fdb = open("hulk", O_RDONLY);
	printf("fdb = %d\n", fdb);
	}

//stdin		0
//stdout	1
//stderr	2
//ironman	3
