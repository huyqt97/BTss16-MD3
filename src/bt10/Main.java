package bt10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File pathfile = new File("src/bt10/text.txt");
        BufferedReader reader = new BufferedReader(new FileReader(pathfile));
        String line = "";
        String[] str = new String[line.length()];
        while((line=reader.readLine())!=null){
            System.out.println(line);
            str = line.split(" ");
        }
        reader.close();
        System.out.println(Arrays.toString(str));
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
           if (map.containsKey(str[i])){
               map.put(str[i],map.get(str[i]) + 1);
           } else  {
               map.put(str[i],1);
           }
        }
        System.out.println(map);
    }
}
