#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
int main(){
	int T,n,i,c,d,e;
	scanf("%d",&T);
	for(i=0;i<T;i++){
		scanf("%d",&n);
		unsigned long long int M[n][n],r[n],s[n],j,k;
		for(j=0;j<n;j++){
			for(k=0;k<n;k++){
				scanf("%llu", &M[j][k]);
			}
		}
		for(j=0;j<n;j++){
			r[j] = 0;
			s[j] = 0;
			for(k=0;k<n;k++){
				r[j] += M[j][k];
				s[j] += M[k][j];
			}
		}
		for(j=0;j<n;j++)
		{
			for(k=0;k<n;k++)
			{
				if(r[j]==s[k]&&s[k]>0)
			{
				s[k]=-1;
				break;
			}
			}
			if(k==n) break;  
		}
		if(j==n)
		printf("Possible\n");
		else
		printf("Impossible\n");
	}
	return 0;
}
