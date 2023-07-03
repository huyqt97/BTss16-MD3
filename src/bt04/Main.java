package bt04;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File pathfile = new File("src/bt04/text.txt");
        BufferedReader reader = new BufferedReader(new FileReader(pathfile));
        String line = "";
        String[] str = new String[line.length()];
        while((line=reader.readLine())!=null){
            System.out.println(line);
            str = line.split(" ");
        }
        reader.close();
        System.out.println(Arrays.toString(str));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length-1; i++) {
            for (int j = i+1; j < str.length; j++) {
                if(str[i].equals(str[j])&& !list.contains(str[i])){
                    list.add(str[i]);
                }
            }
        }
        System.out.println(list);
    }
}
