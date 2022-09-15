import java.util.*;
class Ovning {
    public static void main (String[] arg) {

        String name ,name2 ,greeting = "Welcome ";
        
        System.out.print("Vad heter du? ");
        try (var scan = new Scanner(System.in)) {
            name = scan.next() ;
            name2 = scan.next() ;
        }
        System.out.print(greeting +  name + " " + name2);
    }
}