#include<stdio.h>
#include<stdlib.h>
void main(){
	FILE *ptr;
	char content[500];
	ptr = fopen("demo.txt","r");
	if(ptr==NULL){
		printf("Error while dealing with a file\n");
	}
	fscanf(ptr, "%[^\n]s",content);
	printf("data : %s\n", content);
	fclose(ptr);
}
