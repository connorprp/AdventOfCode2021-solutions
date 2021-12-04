import java.util.*;
import java.io.*;

class Position {
    public static void main(String args[]) throws Exception {
        File input = new File("positiondata.txt");
        Scanner reader = new Scanner(input);
 
        ArrayList<String> positions = new ArrayList<>();
        while (reader.hasNextLine()) {
            positions.add(reader.nextLine());
        }
        navigate(positions);
    }

    public static void navigate(ArrayList<String> data) {
        int horiz_pos = 0;
        int depth = 0;
        int aim = 0;
        for (int i = 0; (i <= data.size() - 1); i++) {
            if (data.get(i).contains("forward")) {
                String instruction = data.get(i);
                int horiz_int = Character.getNumericValue(instruction.charAt(instruction.length() - 1));
                horiz_pos = horiz_pos + horiz_int;
                if (aim > 0) {
                    depth = depth + (aim * horiz_int); 
                }
                if (aim < 0) {
                    depth = depth - (aim * horiz_int);
                }
                
            }
            if (data.get(i).contains("up")) {
                String instruction = data.get(i);
                int aim_int = Character.getNumericValue(instruction.charAt(instruction.length() - 1));
                aim = aim - aim_int;
                
            }
            if (data.get(i).contains("down")) {
                String instruction = data.get(i);
                int aim_int = Character.getNumericValue(instruction.charAt(instruction.length() - 1));
                aim = aim + aim_int;
            }
        }
        int answer = horiz_pos * depth;
        System.out.println(answer);
    }
}