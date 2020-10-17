package generics;

public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] nums = { 1, 2, 3 };
        UserInterface.<Integer>display(nums);
        UserInterface.display(nums);
        String[] names = { "Rust", "Python", "Go" };
        UserInterface.<String>display(names);
        UserInterface.display(names);
    }
}

class UserInterface {
    public static <E> void display(E[] list) {
        for (E e : list)
            System.out.print(e + " ");
        System.out.println();
    }
}
