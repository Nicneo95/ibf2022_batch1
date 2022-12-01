package myapp.list;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class Todo {
    public static main(String[] args) {
        // Create a list of number
        List<Integer> listOfInt = new LinkedList<>();

        // Get the console 
        Console cons = System.console();

        String item = "";

        while(true) {
            item = cons.readLine("Please enter a number:");
            item = item.trim();

            if (item.equals("stop"))
            break;

            listOfInt.add(Integer.parseInt(item));
        }

        System.out.printf("Number of elements in the list: %d\n", listOfInt.size());
        for(Integer index = 0; index <listOfInt.size(); index++);
            System.out.printf("%d: %s\n", index, listOfInt.get(index));
    }
}
