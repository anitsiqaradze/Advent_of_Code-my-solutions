import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;




public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        HashMap<Integer, Integer> uniqueNumbers = new HashMap<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        try {

            Scanner scanner = new Scanner(new File("input1.txt"));
            while(scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().trim().split("\\s+");
                uniqueNumbers.put(Integer.parseInt(parts[0]), 0);
                numbers.add(Integer.parseInt(parts[1]));
            }


            for(int i = 0; i <  numbers.size(); i++) {
                for(int j : uniqueNumbers.keySet()) {
                    if(numbers.get(i) == j) {
                          uniqueNumbers.put(j, uniqueNumbers.get(j) + 1);
                    }
                }
            }

            int result = 0;
            for(int j : uniqueNumbers.keySet()) {
                result += uniqueNumbers.get(j)*j;
            }

            System.out.println(result);



            scanner.close();
       }catch(FileNotFoundException e) {
       System.err.println("file not found" + e.getMessage());
       }

    }

//    public static void divide(ArrayList<Integer> left, ArrayList<Integer> right, String Line) {
//
//       String[] parts = Line.trim().split("\\s+");
//       left.add(Integer.parseInt(parts[0]));
//       right.add(Integer.parseInt(parts[1]));
//
//
//    }






}