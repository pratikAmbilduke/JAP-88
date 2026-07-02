import java.util.*;

class LinkedList1
{
    public static void main(String args[])
    {
        LinkedList<String> list =
                new LinkedList<>();

        list.add("Java");
        list.add("Python");

        list.addFirst("HTML");

        list.addLast("C++");

        System.out.println(list);

        System.out.println(
                list.getFirst());

        System.out.println(
                list.getLast());

        list.removeFirst();

        System.out.println(list);
    }
}