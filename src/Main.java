import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите путь к bin файлу для десераилизации");
        Scanner sc = new Scanner(System.in);
        String pathStr = sc.nextLine();
        Path path = Path.of(pathStr);
        validatePath(pathStr);
        EEP_ParamStruct eep_paramStruct =  EEP_ParamStructDeserializer.deserialize(path);
        System.out.println(eep_paramStruct);
    }

    public static void validatePath(String path){
        File file = new File(path);
        if (file.length() != 127 || !file.isFile()){
            throw new IllegalArgumentException("Given path is incorrect");
        }
    }
}