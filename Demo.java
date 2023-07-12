import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter ");

        char EnterLetter = sc.next().charAt(0);

        switch (EnterLetter) {
          case 'a':
            System.out.println("this is the vowels");
            break;

          case 'e':
            System.out.println("this is the vowels");
            break;

          case 'i':
            System.out.println("this is the vowels");
            break;

          case 'o':
            System.out.println("this is the vowels");
            break;

          case 'u':
            System.out.println("this is the vowels");
            break;
        
          default:
            System.out.println("This is not a vowels");
            break;
        }
    }
}
