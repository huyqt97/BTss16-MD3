package bt07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File pathfile = new File("src/bt07/text.txt");
        BufferedReader reader = new BufferedReader(new FileReader(pathfile));
        String line = "";
        String[] str = new String[line.length()];
        while((line=reader.readLine())!=null){
            System.out.println(line);
            str = line.split(" ");
        }
        reader.close();
        List<String> list = Arrays.asList(str);
        List<String> upperList = new ArrayList<>();
        System.out.println(list);
        for (String s : list) {
            upperList.add(s.toUpperCase());
            }
        System.out.println(upperList);
        }
    }

