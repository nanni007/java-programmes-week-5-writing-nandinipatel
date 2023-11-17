import java.util.ArrayList;

public class Programme_7_UnderGroundTubeNames {
    public void isEmpty(){
        ArrayList<String> tubeNames = new ArrayList<>();
        tubeNames.add("Bakerloo_lines");
        tubeNames.add("Central_lines");
        tubeNames.add("Circle_lines");
        tubeNames.add("District_lines");
        tubeNames.add("Hammersmith_and_City_line");
        tubeNames.add("Jubliee_line");
        tubeNames.add("Metropolitan_line");
        tubeNames.add("Northern_line");
        tubeNames.add("Piccadilly_line");
        tubeNames.add("Victoria_lines");
        tubeNames.add("Waterloo_and_City_line");
        System.out.println("Given Array List: " + tubeNames);
        if ((tubeNames.isEmpty())){
            System.out.println("Given Array list is Empty!!!");
        }else{
            System.out.println("Given array list is not Empty!!!");
        }
    }

    public static void main(String[] args) {
        Programme_7_UnderGroundTubeNames obj = new Programme_7_UnderGroundTubeNames();
        obj.isEmpty();
    }
}
