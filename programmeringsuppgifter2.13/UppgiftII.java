import java.util.Scanner;

class UppgiftII {
    public static void main(String[] args) {

        String namn, efternamn;
        try (var scan = new Scanner(System.in)) {
            System.out.println("Skriv in ditt Efternamn mellanslag förnamn");
            namn = scan.nextLine();
        }

        namn = namn.trim();                 //Remove spaces before and after string
        var i = namn.lastIndexOf(' ');  //Give int i value of last space in string
        var j = 0;                          //Give int j value of 0
        efternamn = namn.substring(j, i);   //Give value of string namn between index j-i
        efternamn = efternamn.toUpperCase();//Make string uppercase
        System.out.println(efternamn);      //Print String
    }
}
