#include <stdio.h>

int main(int argc, char const *argv[])
{
    void *r;
    r = 12;
    printf("%d\n", r);
    r = "String";
    printf("%s\n", r);
    return 0;
}
