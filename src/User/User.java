package User;

import CSVFile.CSVFile;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class User {

    private final UUID userID = UUID.randomUUID();
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private static final String filePath = "src\\Files\\user_info.csv";


    public User(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public UUID getUserID() { return userID; }


    public static void register(User client) throws IOException {
        CSVFile.check(filePath);
        CSVFile.write(filePath,client);
    }

    public static ArrayList<Object> convertStringToObject() throws IOException {
        ArrayList<Object> objectList = new ArrayList<Object>(Collections.singleton(CSVFile.read(filePath)));
        return objectList;
    }
    public static void display() throws IOException {
        ArrayList<Object> convertedArray = convertStringToObject();
        for (int i=0;i<convertedArray.size();i++){
            System.out.println(convertedArray.get(i));
        }
    }
}
