public class Main {
    /*
Write a method named printSquareStar with one parameter of type int named number.
If number is < 5, the method should print "Invalid Value".
The method should print diagonals to generate a rectangular pattern composed of stars (*).
This should be accomplished by using loops (see examples below).
printSquareStar(8); should print the following:

               ********
               **    **
               * *  * *
               *  **  *
               *  **  *
               * *  * *
               **    **
               ********
*/
    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
            return;
        }

        for (int row=1;row<=number ;row++ ){
            for (int col=1;col<=number ;col++ ){
                if (row == 1 || row == number ||
                        col == 1 || col == number ||
                        row == col ||
                        col == (number - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSquareStar(8);
    }

}