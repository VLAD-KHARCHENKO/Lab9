import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Client client = new Client();
        double[] A = new double[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter parameters");
        System.out.println("Enter a1");
        A[0] = scanner.nextDouble();
        System.out.println("Enter b1");
        A[1] = scanner.nextDouble();
        System.out.println("Enter c1");
        A[2] = scanner.nextDouble();
        System.out.println("Enter a2");
        A[3] = scanner.nextDouble();
        System.out.println("Enter b2");
        A[4] = scanner.nextDouble();
        System.out.println("Enter c2");
        A[5] = scanner.nextDouble();

       System.err.println("\n"+client.gaussian(A));

    }
}
