#include<stdio.h>
void main(){
	int age, mark, count;
	float percant, length, width;
	double pie, abc, def;
	char a, b, c, d, e;
	
	printf("enter value of age ");
	scanf("%d",&age);
	printf("enter value of mark ");
	scanf("%d",&mark);
	printf("enter value of count ");
	scanf("%d",&count);
	printf("enter value of percant ");
	scanf("% .2f ", &percant);
	printf("enter value of length ");
	scanf(" %.2f ", &length);
	printf("enter value of width ");
	scanf(" %.2f ", &width);
	printf("enter value of pie ");
	scanf(" %.2lf ", &pie);
	printf("enter value of abc ");
	scanf(" %.2lf ",&abc);
	printf("enter value of def ");
	scanf(" %.2lf ", &def);
	printf("enter value of a ");
	scanf(" %c ", &a);
	printf("enter value of b ");
	scanf(" %c ", &b);
	printf("enter value of c ");
	scanf(" %c ", &c);
	printf("enter value of d ");
	scanf(" %c ", &d);
	printf("enter value of e ");
	scanf(" %c ", &e);
	printf("age=%d\nmark=%d\ncount=%d\n", age, mark, count);
	printf("percant=%.2f\nlength=%.2f\nwidth=%.2f\n", percant, length, width);
	printf("pie=%.2lf\nabc=%.2lfdef=%.2lf", pie, abc, def);
	printf("a=%c\nb=%c\nc=%c\nd=%c\ne=%c\n", a, b, c, d, e);	
}
