package bt11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File pathfile = new File("src/bt11/text.txt");
        BufferedReader reader = new BufferedReader(new FileReader(pathfile));
        String line = "";
        String[] str = new String[line.length()];
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            str = line.split(" ");
        }
        reader.close();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if (map.containsKey(str[i])) {
                map.put(str[i], map.get(str[i]) + 1);
            } else {
                map.put(str[i], 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println(list);
        int mostUse = 0;
        String mostUsedWord = "";
        Map<String, Integer> mostUseList = new HashMap<>();
        for (Map.Entry<String, Integer> s : list) {
            String word = s.getKey();
            int count = s.getValue();
            if (count > mostUse) {
                mostUse = count;
                mostUsedWord = word;
            }

        }
        for (Map.Entry<String, Integer> s : list) {
            String word = s.getKey();
            int count = s.getValue();
            if (count == mostUse) {
                mostUseList.put(word, count);
            }

        }
        System.out.println(mostUseList);

    }
}
