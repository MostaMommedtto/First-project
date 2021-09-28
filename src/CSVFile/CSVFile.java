package CSVFile;
import java.io.*;
import java.util.ArrayList;

public class CSVFile{

    public static void NewCSVFile(String filePath) throws IOException,ClassCastException {
        File newFile = new File(filePath);
        if (!newFile.exists()) {
            newFile.createNewFile();
        }
    }
    public static void writeData(String filePath,String data) throws IOException {
        FileWriter writer = new FileWriter(filePath,true);
        writer.append(data);
        writer.append("\n");
        writer.flush();
        writer.close();
    }

    public static void readData(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String strCurrentLine;
        ArrayList<Object> obj = new ArrayList<>();
        while((strCurrentLine = reader.readLine()) != null){
            obj.add(strCurrentLine);
        }
    }

}
