import java.util.Scanner;

public class App {
    private Scanner scanner;
    public App(){
        this.scanner = new Scanner(System.in);

    }

    public void run() {
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Select task");
            System.out.println("0. Exit");
            System.out.println("Task number: ");
            int task = scanner.nextInt();
            switch (task){
                case 0:
                    repeat = false;
                    break;
                default:
                    System.out.println("Select task from list");
            }



        }while(repeat);
    }
}
