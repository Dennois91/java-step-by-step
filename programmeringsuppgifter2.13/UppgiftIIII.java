import java.util.Scanner;

class UppgiftIIII {
    public static void main(String[] args) {

        String input, first, last;
        int amount, i, j, n, m;

        try (var scan = new Scanner(System.in)) {
            System.out.print("Type minimum two words and press Enter:");
            input = scan.nextLine();
        }

        input = input.trim();
        
        amount = input.length();

        i = input.indexOf(' ');       //Give i index value of the first space in input
        j = 0;                           //Give j value 0
        first = input.substring(j, i);    
        
        n = input.lastIndexOf(' ');   //Give n index value of last space in input
        m = input.length();              //Give m value of length of input
        last = input.substring(n, m);

        System.out.println("You Wrote " + amount + " Letters\n" + 
                           "The first word was: " + first + 
                           "\nThe last word was:" + last);
    }
    
}
