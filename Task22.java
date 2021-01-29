import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        int noofrows;
        System.out.print("Input number of noofrows: ");
        Scanner in = new Scanner(System.in);
        noofrows = in.nextInt();
        for(int i =0;i<noofrows;i++) {
            int number = 1;
            System.out.format("%"+(noofrows-i)*2+"s","");
            for(int j=0;j<=i;j++) {
                 System.out.format("%4d",number);
                 number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
