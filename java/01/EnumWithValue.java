enum Month {
    JAN(31), FEB(28), MARCH(31), APR(30);

    private int value;

    private Month(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class EnumWithValue {
    public static void main(String[] args) {

        System.out.println(Month.JAN);
        System.out.println(Month.JAN.ordinal());
        System.out.println(Month.JAN.getValue());
        System.out.println(Month.FEB.ordinal());
        System.out.println(Month.FEB.getValue());

        for (Month m : Month.values()) {
            System.out.println(m.ordinal());
            System.out.println(m.getValue());
        }

        System.out.println(Month.valueOf("JAN").getValue());
    }
}
