package basics;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println(getAge());
    }

    public static int getAge() {
        try {
            return 1;
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println("Okay");
        }
        return 0;
    }

}
