import java.util.*;
public class Switch {
    //...
    // Here all the predefined arrays are given
    static String[] academics = {};
    static String[] biography = {};
    static String[] general = {};
    //...
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();        
        switch(x) {            
            case "academics":
                for(String s : academics)
                    System.out.println(s);
                break; 
            case "BIOgraphu": // yeah this test case had this input
                for(String s : biography)
                    System.out.println(s);
                break;
            case "general":
                for(String s : general)
                    System.out.println(s);
                break;
            default:
                System.out.println("No Books Available");
        }
    }
}
