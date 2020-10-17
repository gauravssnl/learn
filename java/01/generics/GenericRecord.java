package generics;

import java.util.Arrays;

public class GenericRecord<E> {
    private E[] record;

    public GenericRecord(int length) {
        record = (E[]) new Object[length];
    }

    public void add(int index, E item) {
        record[index] = item;
    }

    public E get(int index) {
        if (index < 0 || index > record.length)
            return null;
        return record[index];
    }

    public E first() {
        return record[0];
    }

    public E last() {
        return record[record.length - 1];
    }

    @Override
    public String toString() {
        return "GenericRecord [record=" + Arrays.toString(record) + "]";
    }

}
