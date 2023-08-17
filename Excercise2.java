import java.util.Scanner;

public class Excercise2{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num;

        System.out.print("Write a number: ");
        num = entry.nextInt();
        
        int square = numberSquare(num);
        System.out.println("The square of number " + num + " is " + numberSquare(num));

    }

    public static int numberSquare(int number){

        int square = (int) Math.pow(number, 2);

        return square;
    }

} 

