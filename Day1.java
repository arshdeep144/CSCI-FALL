import java.util.*;

/**
 * Day1
 *
 * This is the code we worked on in the first
 * lecture.
 *
 * @author Randy J. Fortier
 * @date September 9, 2016
 **/
public class Day1 {
    /**
     * main
     *
     * This is the entry point for our app
     *
     * @arg args Command-line arguments
     **/
    public static void main(String[] args) {
        System.out.println("Hello");
        
        // everything is a comment int i;
        int age = 20;
        
        int score = 10;
        long longVal1 = 1;
        long longVal2 = 1L;
        Integer integerVal = 13;
        
        float floatVal1 = 1.0F;
        //float floatVal2 = 1.0;
        double doubleVal1 = 1.0;
        double doubleVal2 = 1.0F;
        
        char ch = 'A';
        
        // WE ARE HERE
        if (doubleVal1 < 0.5) {
            
        } else if (doubleVal1 > 0.5) {
            
        } else {
            // equal
        }
        
        if ((doubleVal1 < 0.5) && 
            (doubleVal1 > 0.0)) {
            
        }
        
        if ((doubleVal1 <= 0.0) || 
            (doubleVal1 >= 0.5)) {
            
        }
        
        Object obj = null;
        if ((obj != null) && (obj.toString() != null)) {
            
        }

        int choice = 7;
        switch (choice) {
            case 0:
                // do something for 0
                break;
            case 1:
                // do something for 1
                break;
            default:
                // do something for ???
                break;            
        }
        
        int hp = -30;
        hp = (hp < 0) ? 0 : hp;
        
        int numTurns = 3;
        while (numTurns > 0) {
            // do something
            numTurns--;
        }

        numTurns = 3;
        do {
            // do something
            numTurns--;
        } while (numTurns > 0);
        
        for (int i = 0; i < 10; i++) {
            String name = "Randy";
            // do some stuff
        }
        
        //System.out.println(name);
        
        ArrayList<String> games = 
                          new ArrayList<>();
        games.add("Skyrim");
        games.add("NBA2K");
        games.add("The Witcher 3");
        games.add("Starcraft 2");
        
        for (String game : games) {
            System.out.print(game + "\t");
        }
        System.out.println("");
        
        System.out.printf("Total cost: $%.2f, tax: $%.2f\n", doubleVal1, 0.13f);
        
        System.out.println("Arguments:");
        for (String arg: args) {
            System.out.println(arg);
        }
        
        System.out.println("Hello, " + args[0]);
        
        Scanner in = new Scanner(System.in);
        ArrayList<String> tokens = 
                         new ArrayList<>();
        while (in.hasNext()) {
            String token = in.next();
            tokens.add(token);
        }
        
        for (String token: tokens) {
            System.out.println(token);
        }
    }
}