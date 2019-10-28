import java.util.ArrayList;

public class Metoder {

    //Constructor
    public Metoder()
    {
        //Initialize stuff
    }

    // Main method, will be the first method run in a java application
    public static void main(String[] args) {
        //Variable of type ArrayList<String>, containing a lsit of strings.
        ArrayList<String> list = new ArrayList<String>();
        //Adding values to the ArrayList list.
        list.add("hej");
        list.add("på");
        list.add("dig!");
        System.out.println(ConcatStringsFromArray(list));
    }

    //Basic method that takes a list of strings as input and returns a concatination of them.
    public static String ConcatStringsFromArray(ArrayList<String> list) {
        String result = "";
        for (String s : list) {
            result = result + " " + s; // result += " " + s;
        }
        return result;
    }

    //Basic generic meyhod. <T> indicates that whenever T is reffered to in that method and its declaration it can be any type of object.
    private <T> void GenericMethod(T t) {
    }

    //An axample of a recursive method that will run until counter is 5 or larger.
    private static void RecursiveMethod(int counter) {
        if (counter >= 5) {
            return;
        }
        counter++;
        RecursiveMethod(counter);
    }
}