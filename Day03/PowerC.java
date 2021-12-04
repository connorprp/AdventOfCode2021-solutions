import java.util.*;
import java.io.*;

class PowerC {
    public static void main(String args[]) throws Exception {
        File input = new File("binarydata.txt");
        Scanner reader = new Scanner(input);
 
        ArrayList<String> binaries = new ArrayList<>();
 

        while (reader.hasNextLine()) {
            binaries.add(reader.nextLine());
        }
        getBit(binaries);
    }
    public static void getBit(ArrayList<String> data) {
        ArrayList<Integer> pos1 = new ArrayList<>();
        ArrayList<Integer> pos2 = new ArrayList<>();
        ArrayList<Integer> pos3 = new ArrayList<>();
        ArrayList<Integer> pos4 = new ArrayList<>();
        ArrayList<Integer> pos5 = new ArrayList<>();
        ArrayList<Integer> pos6 = new ArrayList<>();
        ArrayList<Integer> pos7 = new ArrayList<>();
        ArrayList<Integer> pos8 = new ArrayList<>();
        ArrayList<Integer> pos9 = new ArrayList<>();
        ArrayList<Integer> pos10 = new ArrayList<>();
        ArrayList<Integer> pos11 = new ArrayList<>();
        ArrayList<Integer> pos12 = new ArrayList<>();
        for (int i = 0; (i <= 999); i++) {
            int num1 = Character.getNumericValue(data.get(i).charAt(0));
                pos1.add(num1);
            int num2 = Character.getNumericValue(data.get(i).charAt(1));
                pos2.add(num2);
            int num3 = Character.getNumericValue(data.get(i).charAt(2));
                pos3.add(num3);
            int num4 = Character.getNumericValue(data.get(i).charAt(3));
                pos4.add(num4);
            int num5 = Character.getNumericValue(data.get(i).charAt(4));
                pos5.add(num5);
            int num6 = Character.getNumericValue(data.get(i).charAt(5));
                pos6.add(num6);
            int num7 = Character.getNumericValue(data.get(i).charAt(6));
                pos7.add(num7);
            int num8 = Character.getNumericValue(data.get(i).charAt(7));
                pos8.add(num8);
            int num9 = Character.getNumericValue(data.get(i).charAt(8));
                pos9.add(num9);
            int num10 = Character.getNumericValue(data.get(i).charAt(9));
                pos10.add(num10);
            int num11 = Character.getNumericValue(data.get(i).charAt(10));
                pos11.add(num11);
            int num12 = Character.getNumericValue(data.get(i).charAt(11));
                pos12.add(num12);
            }
        }
    public static int countBigger(ArrayList<Integer> bits) {
        
        int zeros = 0;
        int ones = 0;
        for (int i = 0; (i <= bits.size() - 1); i++) {
            if (bits.get(i) == 0) {
                zeros++;
            }
            if (bits.get(i) == 1) {
                ones++;
            }
        }
        if (zeros > ones) {
            
        }
        if (ones > zeros) {
            
        }
        else {
            System.out.println("Error...");
            return 2;
        }
    }
    public static int countSmaller(ArrayList<Integer> bits) {
        int zeros = 0;
        int ones = 0;
        for (int i = 0; (i <= bits.size() - 1); i++) {
            if (bits.get(i) == 0) {
                zeros++;
            }
            if (bits.get(i) == 1) {
                ones++;
            }
        }
        if (zeros > ones) {
            return 1;
        }
        if (ones > zeros) {
            return 0;
        }
        else {
            System.out.println("Error...");
            return 2;
        }
    }
}