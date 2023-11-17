import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Programme_6_RetrieveArrayListAtGiveIndex {
    public static void main(String[] args) {
        ArrayList<String>vegetableList = new ArrayList<>();
        vegetableList.add("CUCUMBER");
        vegetableList.add("POTATO");
        vegetableList.add("CAULIFLOWER");
        vegetableList.add("BRINGLE");
        vegetableList.add("CARROT");
        vegetableList.add("BEETROOT");
        vegetableList.add("MUSHROOM");
        vegetableList.add("BITTER_GOURD");
        System.out.println(vegetableList);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an index number: ");
        int index = scan.nextInt();
        if (index< vegetableList.size()){
            System.out.println(vegetableList.get(index));
        }else{
            System.out.println("Invalid index!!!");
        }
        scan.close();
    }

}
