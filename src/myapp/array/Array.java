package myapp.array;

public class Array {

    String[] tasks = new String[3];

    tasks[0] = "running";
    tasks[1] = "eating";
    tasks[2] = "jogging";

    System.out.println(tasks);
    System.out.println(tasks[0]);
    System.out.println(tasks[1]);
    System.out.println(tasks[2]);
    System.out.println(tasks.length);

    // looping through an array 
    // for (int i = 0; i < tasks.length; i++) {
    //     System.out.println(tasks[i]);
    // }

    // int i = 0;
    // while(i<3) {
    //     System.out.println(tasks[i]);
    // }


}
