import java.util.*;
import java.io.*;

public class Oxygen {
    public static void main(String args[]) throws Exception {
        File input = new File("binarydata.txt");
        Scanner reader = new Scanner(input);
 
        ArrayList<String> binaries = new ArrayList<>();
 

        while (reader.hasNextLine()) {
            binaries.add(reader.nextLine());
        }

        ArrayList<String> answer = binaries;
    
    /*for (int i = 0; i <= 20; i++) {
        answer = checkBit(answer, i);
        if (answer.size() == 1) {
            break;
        }*/
        answer = checkBit(answer, 0);
        answer = checkBit(answer, 1);
        answer = checkBit(answer, 2);
        answer = checkBit(answer, 3);
        answer = checkBit(answer, 4);
        answer = checkBit(answer, 5);
        answer = checkBit(answer, 6);
        answer = checkBit(answer, 7);
        answer = checkBit(answer, 8);
       
        System.out.println(answer);
    }
    
    public static ArrayList<String> checkBit(ArrayList<String> bits, int k) {
        ArrayList<String> onesBits = new ArrayList<>();
        ArrayList<String> zerosBits = new ArrayList<>();
        for (int i = 0; i <= (bits.size() - 1); i++) {
            if (Character.getNumericValue(bits.get(i).charAt(k)) == 1) {
                onesBits.add(bits.get(i));
                }
            if (Character.getNumericValue(bits.get(i).charAt(k)) == 0) {
                zerosBits.add(bits.get(i));
                }
            }
            if (onesBits.size() < zerosBits.size()) {
                return onesBits;
            } 
            else if (zerosBits.size() < onesBits.size()) {
                return zerosBits;
            }
            else {
                return zerosBits;
            }
    }
}

