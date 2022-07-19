import java.util.Scanner;

class UppgiftIII {
    public static void main(String[] args) {

        String name, surname;
        try (var scan = new Scanner(System.in)) {
            System.out.println("Type you're first name:");
            name = scan.next();
            System.out.println("Type you're last name:");
            surname = scan.next();
        }

        surname = surname.toUpperCase();
        
        System.out.println("Hello " + surname + " " + name);
    }  
}
