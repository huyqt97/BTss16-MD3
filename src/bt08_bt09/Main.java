package bt08_bt09;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File pathfile = new File("src/bt08_bt09/text.txt");
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
        List<String> reverseLowerList = new ArrayList<>();
        for (int i = upperList.size()-1; i >=0  ; i--) {
            reverseLowerList.add(upperList.get(i).toLowerCase());
        }
        System.out.println(reverseLowerList);
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/bt08_bt09/copyText.txt"));
        for (String s : reverseLowerList) {
            writer.write(s);
            writer.write(" ");

        }
        writer.close();
    }

    }

