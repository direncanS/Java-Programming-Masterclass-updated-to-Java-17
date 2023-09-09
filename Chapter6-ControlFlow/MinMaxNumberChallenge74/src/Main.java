import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        minMaxFinder();
    }
    public static void minMaxFinder(){
        Scanner scanner = new Scanner(System.in);

        int max=Integer.MAX_VALUE,min=Integer.MIN_VALUE,controlNumber;
        boolean control= true;
        boolean firstControl=true;

        while (control){
            String nextNumber = scanner.nextLine();
            try {
                controlNumber = Integer.parseInt(nextNumber);
                // Since we will choose min max among the values entered by the user, we will assign the first value to min max.
                // Later, we will set the boolean value to false so that it does not enter this if condition again.
                if (firstControl){
                    min=controlNumber;
                    max=controlNumber;
                    firstControl=false;
                }
                else{
                    if (min>controlNumber)
                        min=controlNumber;
                    if (max<controlNumber)
                        max=controlNumber;
                }
            }catch (NumberFormatException nfs){
                control=false;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max : " + max);

    }
}
