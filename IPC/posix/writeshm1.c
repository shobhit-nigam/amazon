#include<stdio.h>
#include<string.h>
#include<fcntl.h>
#include<sys/mman.h>
#include<unistd.h>
int main()
	{
	int fd=0, pid=0;
	void *shm;
	fd = shm_open("/name", O_CREAT|O_RDWR, 0666);
	ftruncate(fd, 200);
	shm = mmap(0, 200, PROT_WRITE, MAP_SHARED, fd, 0);
	memset(shm, 0, 200);
	strcpy(shm, "valar morghulis");
	munmap(shm, 200);
	close(fd);
	return 0;
	}