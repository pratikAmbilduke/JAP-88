import java.util.*;

class NonGeneric1
{
    public static void main(String args[])
    {
        ArrayList list = new ArrayList();

        list.add("Java");
        list.add("Python");

        String s = (String)list.get(0);

        System.out.println(s);
    }
}