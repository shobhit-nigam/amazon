#include<sys/shm.h>
#include<sys/ipc.h>
#include<unistd.h>
#include<stdio.h>
#include<string.h>

int main()
{
	int key,id,pid;
	void *a;
	key=ftok("/root",100);
	//like all other sysV IPCs, ftok here is used to create a key

	id=shmget(key,100,IPC_CREAT|0777);
	//shmget is used to create (or get id) shared memory
	//1st parameter = key
	//2nd parameter = size of shared memory in bytes
	//3rd parameter = flags & permissions
	
	a=shmat(id,0,0);
	//shmat creates a pointer to the shared memory segment
	//1st parameter = id
	//2nd parameter = address from where we want the shared memory
	//	if keep this as 0 then OS chooses an appropriate location on our behalf
	//3rd parameter = certain flags, can be kept 0 for simple communication

	//after we get the pointer, reading & writing is very simple 
	printf("a = %s\n", a);
	shmdt(a);
	//detach the pointer from the shared memory 
}


