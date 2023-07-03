package bt02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/bt02/text.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int count = 0;
        while (reader.readLine() != null) {
            count++;
        }
        reader.close();
        System.out.println("Số dòng: " + count);
    }

}
