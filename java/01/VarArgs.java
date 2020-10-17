public class VarArgs {
    public static void readVariableIntList(int... numbers) {
        for (var number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        readVariableIntList(1, 2, 3);
        readVariableIntList(100, 200, 300);
    }
}