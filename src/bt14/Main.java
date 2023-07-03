package bt14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File pathfile = new File("src/bt14/text.txt");
        BufferedReader reader = new BufferedReader(new FileReader(pathfile));
        String line = "";
        String[] str = new String[line.length()];
        while((line=reader.readLine())!=null){
            System.out.println(line);
            str = line.split(" ");
        }
        reader.close();
        List<String> list = Arrays.asList(str);
        System.out.println(list);
        System.out.println(list.size());
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/bt14/copyText.txt"));
        for (int i = 1; i <= list.size(); i++) {
            writer.write(String.valueOf(i));
            writer.write(" ");
        }
        writer.close();
    }
}
