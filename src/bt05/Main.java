package bt05;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File pathFile = new File("src/bt05/text.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
        String line = "";
        String[] str = new String[line.length()];
        while((line=bufferedReader.readLine())!=null){
            System.out.println(line);
            str = line.split(" ");
        }
        bufferedReader.close();
        List<String> list = Arrays.asList(str);
        Collections.sort(list);
        System.out.println(list);
    }
}
