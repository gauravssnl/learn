#include <stdio.h>
// #include <stddef.h>
#include <stdlib.h>
#include <iso646.h>

int main(int argc, char const *argv[])
{
    wchar_t wc = L'\x3B1';  // Greek lowercase alpha, α
    char mbStr[10] = "";
    int nBytes = 0;
    nBytes = wctomb(mbStr, wc);
    if (nBytes < 0)
        puts("Not a valid multibyte character in your locale.");
    printf("mbStr: %s\n", mbStr);

    // Universal Character Names
    char alpha = '\u03B1';
    printf("Alpha: %s\n", alpha);

    wchar_t alpahw = '\u03B1';
    printf("Alphaw: %c\n", alpahw);

    // char16_t alphac = u'\u03B1';
    // printf("Alphac: %c\n", alpahc);

    // Digraphs 
    // <: - [ , :> - ] , <% - { , %> - } , %: - # , %:%: - ##
    int arr<::> = <% 10, 20, 30 %>;
    printf("The second array element is %d.\n", arr<:1:>);
    
    // Trigraphs
    // ??( - [ , ??) -  ] , ??< - { , ??= - # , ??/ - \ , ??! - | , ??' - ^ , ??- means ~
    printf("Cancel???(y/n)\n");

    printf("%d \t %d\n", 1 and 0, 1 and 1);
   

    const char ग[]  = "गौरव";
    printf("Gaurav: %s\n", ग);
    return 0;
}
