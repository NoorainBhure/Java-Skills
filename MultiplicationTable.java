import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int i=1;

    System.out.println("Enter One Number :");
    int number=sc.nextInt();
    while(i<=10){
        System.out.println(number + " x " + i +" = " +(number*i));
        i++;
    }
    sc.close();
    }

}
