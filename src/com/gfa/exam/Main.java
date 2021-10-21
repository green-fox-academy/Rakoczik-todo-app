package com.gfa.exam;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Command Line Todo application\n" +
                    "=============================\n" +
                    "\n" +
                    "Command line arguments:\n" +
                    "    -l   Lists all the tasks\n" +
                    "    -a   Adds a new task\n" +
                    "    -r   Removes an task\n" +
                    "    -c   Completes an task");

        } else if (args[0].equals("-l")) {
            ListTasks taskList = new ListTasks("com/gfa/exam/test.txt");
            System.out.println(taskList.dataStored());
        } else if (args[0] == "-a") {

        } else if (args[0] == "-r") {

        } else if (args[0] == "-c") {

        }
    }
}
