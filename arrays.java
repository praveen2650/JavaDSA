import java.util.*;
public class arrays {
    public static void main(String[] args) {
        int marks [] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy : "+ marks[0]); //phy
        System.out.println("chem : "+ marks[1]); //chem
        System.out.println("math : "+ marks[2]); //math

        int percentage = (marks[0]+marks[1]+marks[2]) /3;
        System.out.println("percentage = "+ percentage +"%");

    }

    
}
