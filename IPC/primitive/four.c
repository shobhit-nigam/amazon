#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
void main()
	{
	int fd=0;
	static char buf[20];
	printf("opening shrek\n");
	fd = open("shrek", O_RDONLY);
	printf("reading from shrek\n");
	read(fd, buf, 4);
	printf("read data is %s\n", buf);
	}
