import service.ExercisesService;
import service.impl.ExercisesServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExercisesService exercisesService = new ExercisesServiceImpl();

        boolean loop = true;
        do{
            System.out.println("=== SHA TEST ===");
            System.out.println("1. Question 1");
            System.out.println("2. Question 2");
            System.out.println("3. Question 3");
            System.out.println("4. Exit");
            System.out.println("Choose Question : ");
            String in = scanner.nextLine();
            try{
                int input = Integer.parseInt(in);
                switch (input){
                    case 1:
                        exercisesService.rusak(1000);
                        break;
                    case 2:
                        int k = 8;
                        int b = 8;
                        int result = exercisesService.roger(k, b);
                        System.out.printf("Return value dari pemanggilan roger(%d, %d) adalah %d%n", k, b, result);
                        break;
                    case 3:
                        exercisesService.countCharacter("pemrogramanDasarJava1");
                        break;
                    case 4:
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please enter a number between 1 and 4");
                        break;
                }
            }catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number");
            }
        }while(loop);

        scanner.close();

    }
}