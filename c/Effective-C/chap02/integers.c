#include <stdio.h>

int main()
{
    signed char c = 'A';
    short int i = 6;
    short j = 7;
    int k = 13;
    long int li = 3;
    long lm = 2; // int keyword is not required to be specified.
    long long ll = 13;
    long long int lli = 34;
    printf("c = %d, i = %d, j = %d, k = %d, li = %ld, lm = %li, ll = %lld, lli = %lli", c, i, j, k, li, lm, ll, lli);
    return 0;
}