import java.util.*;

class Generic
{
    public static void main(String args[])
    {
        ArrayList<String> list =
                new ArrayList<>();

        list.add("Java");
        list.add("Python");

        for(String s : list)
        {
            System.out.println(s);
        }
    }
}