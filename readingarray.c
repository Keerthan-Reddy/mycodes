#include <stdio.h>
#include <stdlib.h>

int main(){
int n,*p;
printf("enter the size of an array");
scanf("%d",&n);

for (int i = 0; i < n; i++)
{
    p=(int*)malloc(sizeof(n));
}

printf("enter the elements");
for (int i = 0; i < n; i++)
{
    scanf("%d",&p[i]);
}

for (int i = 0; i < n; i++)
{
    printf("%d ",p[i]);
}

return 0;
}
