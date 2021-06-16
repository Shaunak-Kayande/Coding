#include<stdio.h>
int main(){
    int a[3],b[3],x=0,y=0,i;
    for(i=0;i<3;i++){
        scanf("%d",&a[i]);
    }
     for(i=0;i<3;i++){
        scanf("%d",&b[i]);
        if(a[i] > b[i]) x++;
        if(b[i] > a[i]) y++;
    }
    printf("%d %d",x,y);
}
