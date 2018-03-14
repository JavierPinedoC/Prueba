#include "stdio.h"
int main(int argc, char const *argv[])
{
	int a,b;
	printf("Numero menor\n");
	scanf("%i",&a);
	printf("Numero mayor\n");
	scanf("%i",&b);

	for (a; a < b ; ++a)
	{
		if (a%2==0)
		{
			
		}
		else
			printf("%i\n",a);
	}
	return 0;
}