import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Runnable drawStar = () -> System.out.print('*');
        Runnable drawSpace = () -> System.out.print(' ');
        System.out.println("Adj meg egy számot:");
        Scanner scn = new Scanner(System.in);
        int height = scn.nextInt();
        int length = 1;

        for(int i = 0; i < height;i++){
            for(int j = 0; j < height-i;j++){
                drawSpace.run();
            }
            for(int j = 0; j < length;j++){
                drawStar.run();
            }
            length += 2;
            System.out.print('\n');
        }
        length -= 4;
        for(int i = height; length > 0;i--){
            for(int j = 0; j < height-(i-2);j++){
                drawSpace.run();
            }
            for(int j = 0; j < length;j++){
                drawStar.run();
            }
            length -= 2;
            System.out.print('\n');
        }
    }
}