import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          readingInput();
    }
    public static void readingInput(){
        Scanner scanner = new Scanner(System.in);
        int count=1,sum=0;

        do {
            System.out.println("Entered number#"+count+":");
            String stringInput = scanner.nextLine();
            try {
                int input = Integer.parseInt(stringInput);
                count++;
                sum+=input;
            }catch (NumberFormatException nfs){
                System.out.println("Invalid Number");
            }

        }while(count<=5);
        System.out.println("Summary: " + sum);
    }
}