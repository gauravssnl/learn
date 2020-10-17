package generics.wildcards;

import generics.GenericRecord;

public class LowerBoundedWildCard {

    class Student {

    }

    class CollegeStudent extends Student {

    }

    class CollegDayScholar extends CollegeStudent {

    }

    class CollegHosteller extends CollegeStudent {

    }

    public static void update(GenericRecord<? super CollegDayScholar> studentRecord) {

    }
}
