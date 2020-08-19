import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("    ____________________________________________________________\n" +
                "     Hello! I'm Duke\n" +
                "     What can I do for you?\n" +
                "    ____________________________________________________________\n");
        boolean stop = false;
        while(!stop){
            String input = sc.nextLine();
            Userinput userinput = new Userinput(input);
            String output = userinput.getDukeResponse();
            System.out.println(output);
            stop = userinput.getTerminate();
        }
        if (stop) {
            sc.close();
        }
    }
}
