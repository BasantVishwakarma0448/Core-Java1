#include<stdio.h>
void main(){
	int n, deposite, withdraw, PIN=1256, balance=12000;
	printf("1.Deposite\n2.Withdraw\n3.checkbalance\n");
	scanf("%d",&n);
	if(n==1){
		printf("Enter Deposite amount: ");
		scanf("%d",&deposite);
	}
	else if(n==2){
		printf("Enter Withdrawl amount: ");
		scanf("%d",&withdraw);
	}
	else if(n==3){
		printf("Enter PIN to check acount balance: ");
		scanf("%d",&PIN);
		if(PIN==1256){
			printf("Your total balance is: %d",balance);
		}
		else if(PIN!=1256){
			printf("Wrong pin");
		}
		
	}
	else{
		printf("Enter valid input");
	}
	
}
