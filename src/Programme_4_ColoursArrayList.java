import java.util.ArrayList;

/*
Write a Java program to create a new array list, add some colours (string)
and printout the collection using for each loop.
 */
public class Programme_4_ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String>colorlist=new ArrayList<>();
        colorlist.add("RED");
        colorlist.add("BLUE");
        colorlist.add("GREEN");
        colorlist.add("YELLOW");
        colorlist.add("BLACK");
        colorlist.add("WHITE");
        colorlist.add("ORANGE");
        colorlist.add("PURPLE");
        colorlist.add("CYAN");
        for(String colorList:colorlist){
            System.out.println(colorList + ", ");
        }
    }
}
