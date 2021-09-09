package MainPackage;

import java.io.*;
import java.util.Scanner;
import java.util.UUID;

public class User extends CSVFile{

    private final UUID uuid = UUID.randomUUID();
    public static final String filePath = "E:\\projects\\Java\\First project\\userInfo.csv";
    private String firstName;
    private String lastName;
    private String userName;
    private String password;

    public User(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public UUID getUuid() {
        return uuid;
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


    public static void register(User client) throws IOException {
        writeData(client, client.filePath);
    }

    public static void display() throws FileNotFoundException {
        readData(User.filePath);
    }



}
