import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Runnable drawStar = () -> System.out.print('*');
        Runnable drawSpace = () -> System.out.print(' ');
        System.out.println("Adj meg egy számot:");
        Scanner scn = new Scanner(System.in);
        int height = scn.nextInt();

        for(int i = 1; i < height*2-1;i++){
            for(int j = 0; j < (height-i)/2;j++){
                drawSpace.run();
            }
            for(int j = 0; j < i;j++){
                drawStar.run();
            }
            System.out.print('\n');
        }
    }
}