import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Array of char, length = 4
        char[] symbols = new char[4];
        // Integer T number
        int t = 0;

        // Input number t
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        if (scanner.hasNextInt()) {
            t = scanner.nextInt();
            System.out.println(t);
        } else {
            System.out.println("Wrong, you need to input integer number");
        }

        // Array of String, length = t;
        String[] arrayOfLines = new String[t];

        // Input lines
        for (int i = 0; i < arrayOfLines.length; i++){
            Scanner scannerForLines = new Scanner(System.in);
            System.out.println("Input line: "); // can be deleted
            arrayOfLines[i] = scannerForLines.nextLine();
        }

        System.out.println("\nSee your input lines here: ");
        // arrayOfLines check (can be deleted)
        for(String s: arrayOfLines){
            System.out.println("s = " + s);
        }

        // Check lines about symbols, if the first 2 symbols and second 2 symbols both are the same
        for (int i = 0; i < arrayOfLines.length; i++){
            symbols = arrayOfLines[i].toCharArray();
            if((symbols[0] == symbols[2] || symbols[0] == symbols[3]) & (symbols[1] == symbols[2] || symbols[1] == symbols[3])){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
