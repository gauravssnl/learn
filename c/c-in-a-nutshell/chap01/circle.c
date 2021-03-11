// circle.c: Prints the areas of circles.
// Uses circulararea.c for the math

#include <stdio.h>             // Preprocessor directive

double circularArea(double r); // Function declaration (prototype form)

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