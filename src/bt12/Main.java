package bt12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File pathfile = new File("src/bt12/text.txt");
        BufferedReader reader = new BufferedReader(new FileReader(pathfile));
        String line = "";
        String[] str = new String[line.length()];
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            str = line.split(" ");
        }
        reader.close();
        List<String> list = Arrays.asList(str);
        System.out.println(list);
        System.out.println("Nhập vào chuỗi: ");
        String input = new Scanner(System.in).nextLine();
        List<String> Foundedlist = new ArrayList<>();
        for (String s : list) {
            if (s.contains(input)) {
                Foundedlist.add(s);
            }
        }
        System.out.println(Foundedlist);

    }
}
