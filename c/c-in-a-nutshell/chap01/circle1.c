// circle.c: Prints the areas of circles.
// Uses circulararea.h & circulararea.c for the math

#include <stdio.h>             // Preprocessor directive

#include "circulararea.h"

int main() {
    double radius = 1.0, area;

    printf("    Area of Circles\n\n");
    printf("    Radius          Area\n"
           "--------------------------\n");
    area = circularArea(radius);
    printf("%10.1f      %10.2f\n", radius, area);

    radius = 5.0;
    area = circularArea(radius);
    printf("%10.1f      %10.2f\n", radius, area);
}