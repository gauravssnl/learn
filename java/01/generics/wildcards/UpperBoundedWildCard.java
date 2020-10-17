package generics.wildcards;

import generics.GenericRecord;

public class UpperBoundedWildCard {
    class Student {

    }
    // A method that should take an entity of type Student as well as its subtypes.
    public static void update(GenericRecord<? extends Student> studentRecord) {

    }
}


