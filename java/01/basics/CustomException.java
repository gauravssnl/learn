package basics;

public class CustomException {
    public static void divide(int x, int y) throws MyDivException {
        if (y == 0)
            throw new MyDivException("Divisor cannot be 0.");
        System.out.println(x / y);
    }

    public static void main(String[] args) {
        try {
            divide(10, 3);
            divide(10, 0);
        } catch (MyDivException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyDivException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MyDivException(String message) {
        super(message);
    }

}
