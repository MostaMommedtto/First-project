package MainPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVFile {

    public static void writeData(User client, String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath, true);
        writer.write(client.getFirstName() + " " + client.getLastName() + " " + client.getUserName() + " " + client.getPassword());
        writer.write("\r\n");
        writer.flush();
        writer.close();
    }

    public static void readData(String filePath) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filePath));
        char delimiter = ';';
        input.useDelimiter(String.valueOf(delimiter));
        while (input.hasNext()) {
            System.out.print(input.next() + " ");
        }
        input.close();
    }

}
