#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

void main()
	{
	int fda=0;	
	static char buf[20];
	fda = open("ironman", O_RDONLY);
	read(fda, buf , 4);
	printf("read data is %s\n", buf);
	read(fda, buf , 6);
	printf("read data is %s\n", buf);
	close(fda);
	}

