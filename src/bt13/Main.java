package bt13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/bt13/text.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "";
        String[] str = new String[line.length()];
        while((line=reader.readLine())!=null) {
//            System.out.println(line);
            str = line.split(" ");
            System.out.println(str[0]);
        }

    }

}
