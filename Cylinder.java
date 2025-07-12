import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();

double volume = Math.PI * Math.pow(radius, 2) * height;
System.out.printf("Volume is: %.2f", volume);
    in.close();
  }
}
