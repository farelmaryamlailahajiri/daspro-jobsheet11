import java.util.Scanner;
public class Nesteedloop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double [5][7];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City" + i);
            for (int j = 0; j < temps.length; j++) {
                System.out.print("Day" + (j+1)+ ":");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City" +i);
            for (int j = 0; j < temps.length; j++) {
                System.out.print(temps[i][j]+" ");
            }
            System.out.println();
        }
    }
}
