import java.io.*;
import java.util.*;

class SonarSweep {
    public static void main(String args[]) throws Exception {
        File input = new File("sonardata.txt");
        Scanner reader = new Scanner(input);
        int counter = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        while (reader.hasNextInt()) {
            numbers.add(reader.nextInt());
        }
        sonar(numbers);
    }

    public static void sonar(ArrayList<Integer> data) {
        int counter = 0;
        for (int i = 1; i < 1998; i++) {
            if ((data.get(i - 1) + data.get(i) + data.get(i + 1))  < (data.get(i) + data.get(i + 1) + data.get(i + 2))) {
                counter++;
            }
        }
        System.out.println(counter);
    }

}
