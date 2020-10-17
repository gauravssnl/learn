package generics;

public class GenericRecordDemo {
    public static void main(String[] args) {
        GenericRecord<String> sRecord = new GenericRecord<>(5);
        sRecord.add(0, "Rust");
        sRecord.add(1, "Python");
        sRecord.add(2, "Go");
        sRecord.add(3, "Pascal");
        sRecord.add(4, "Java");
        System.out.println(sRecord.first());
        System.out.println(sRecord.last());
        System.out.println(sRecord.get(1));
        System.out.println(sRecord);
    }
}
