import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileNotFoundException;




public class Main {
    public static void main(String[] args) throws FileNotFoundException {
          int sum =0;
          ArrayList<Integer> leftList = new ArrayList<>();
          ArrayList<Integer> RightList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File("input.txt"));

           while (scanner.hasNextLine()) {
              String line = scanner.nextLine();
               divide(leftList,RightList, line);
          }
           Collections.sort(leftList);
           Collections.sort(RightList);

           for(int i = 0; i < leftList.size(); i++) {
               sum+=RightList.get(i)>leftList.get(i)?RightList.get(i)-leftList.get(i):leftList.get(i)-RightList.get(i);
           }
           System.out.println(sum);
            scanner.close();
       }catch(FileNotFoundException e) {
       System.err.println("file not found" + e.getMessage());
       }

    }

    public static void divide(ArrayList<Integer> left, ArrayList<Integer> right, String Line) {

       String[] parts = Line.trim().split("\\s+");
       left.add(Integer.parseInt(parts[0]));
       right.add(Integer.parseInt(parts[1]));


    }






}