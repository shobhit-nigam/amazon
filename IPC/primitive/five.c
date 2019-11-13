#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

void main()
	{
	int fd=0;
	static char buf[20];
	printf("opening shrek\n");
	fd = open("shrek", O_WRONLY);
	printf("writing to shrek\n");
	write(fd, "fiona is the gf", 15);
	printf("written\n");
	}
