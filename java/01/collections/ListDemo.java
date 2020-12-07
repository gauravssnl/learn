package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Rust");
        List<String> list2 = Arrays.asList("Python", "Go", "Java");
        System.out.println(list2);
        list1.addAll(list2);
        System.out.println(list1);

        // The ListIterator, which is exclusive to lists, is similar to an Iterator.
        // It allows bidirectional traversal and modification of elements.
        ListIterator<String> list1Iterator = list1.listIterator();
        while (list1Iterator.hasNext()) {
            System.out.print(list1Iterator.next() + " ");
        }
        System.out.println();
        System.out.println(list1.get(2));
        System.out.println(list1.size());

        for (String s : list1) {
            System.out.println(s);
        }

        list1Iterator = list1.listIterator();
        while (list1Iterator.hasNext()) {
            String name = list1Iterator.next();
            System.out.println(list1Iterator.nextIndex() + " " + name);
            if ("Java".equals(name)) {
                System.out.println("Removing Java");
                list1Iterator.remove();
            }
            if ("Python".equals(name)) {
                System.out.println(list1);
                System.out.println("Replacing Python");
                list1Iterator.set("Python3");
                /*
                 * Inserts the specified element into the list (optional operation). The element
                 * is inserted immediately before the element that would be returned by next, if
                 * any, and after the element that would be returned by previous, if any.
                 */
                list1Iterator.add("Python2");
            }

        }

        // let us traverse the iteraator in backward direction now
        System.out.println("Traverse in reverse order now");
        while (list1Iterator.hasPrevious()) {
            System.out.println(list1Iterator.previousIndex() + " " + list1Iterator.previous());
        }

        System.out.println(list1);

        Integer[] nums = { 1, 2, 3, 4, 5 };
        List<Integer> list3 = Arrays.asList(nums);
        System.out.println(list3);
        System.out.println(list3.contains(1));
        nums = (Integer[]) list3.toArray();

        Integer[] numsList = new Integer[30];
        Arrays.fill(numsList, 10);
        System.out.println(Arrays.toString(numsList));
        Arrays.fill(numsList, 1, 10, 30);
        System.out.println(Arrays.toString(numsList));

        LinkedList<String> nameList = new LinkedList<>();
        nameList.add("Guido Von Rossum");
        nameList.addFirst("Jack");
        nameList.addLast("Pi");
        nameList.add("Shawn");
        System.out.println(nameList);
        System.out.println(nameList.get(1));
        System.out.println(nameList.getFirst());
        System.out.println(nameList.getLast());
        nameList.offer("John");
        System.out.println(nameList);
        System.out.println(nameList.contains("Pi"));
        // remove Pi from the list
        nameList.removeIf(x -> "Pi".equals(x));
        System.out.println(nameList);

        String[] names = (String[]) nameList.toArray();
        System.out.println(Arrays.toString(names));
    }
}
