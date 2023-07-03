package bt01;
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
            File file = new File("src/bt01/text.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] str = new String[line.length()];
            while((line=reader.readLine())!=null){
                System.out.println(line);
                str = line.split(" ");
            }
            reader.close();
        System.out.println(Arrays.toString(str));
        System.out.println("Số lượng từ: "+str.length);
        }
    }

