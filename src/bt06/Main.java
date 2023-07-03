package bt06;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File pathfile = new File("src/bt06/text.txt");
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
        int max = list.get(0).length();
        for (String s : list) {
            if(s.length()>max){
                System.out.println(s);
            }
        }
    }
}
