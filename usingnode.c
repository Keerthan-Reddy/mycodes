#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node* link;
};

struct node *start = NULL;
struct node *newnode;

void creat(){
    newnode=((struct node*)malloc(sizeof(struct node)));
    printf("enter the data");
    scanf("%d",&newnode->data);
    newnode->link=NULL;

}
void display(){
printf("%d",newnode->data);
}

void main(){
    creat();
    
}
