#include<stdio.h>
#include<stdlib.h>
struct student{
	int rno;
	char name[50];
	float per;
	printf("Enter your rollnumber: ");
	scanf("%d",&s.rno);
	printf("Enter your name: ");
	scanf("%s",&s.name);
	printf("Enter your percantages: ");
	scanf("%f",&s.per);
};
void main(){
	struct student s;

	FILE *ptr;
	ptr = fopen("demo.txt", "w");
	if(ptr==NULL){
		printf("Error while dealing with a file\n");
		exit(0);
	}
	fread(&s, sizeof(struct student), 1, ptr);
	printf("Roll Number: %d\n", s.rno);
	printf("Name: %s\n", s.name);
	printf("Percantages: %.2f", s.per);
	fclose(ptr);
}
