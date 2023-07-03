package bt03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/bt03/countries.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "";
        List<String> countries = new ArrayList<>();
        while((line=reader.readLine())!=null){
            System.out.println(line);
            countries.add(line);
        }
        reader.close();
        for (String country : countries) {
            System.out.println("Country: "+country);
        }
    }
}
