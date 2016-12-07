package com.example.veiber.testmobilegrinyak.Model;

/**
 * Created by epl on 07.12.16.
 */
public class DatabaseManager {
    private static DatabaseManager ourInstance = new DatabaseManager();

    public static DatabaseManager getInstance() {
        return ourInstance;
    }

    private DatabaseManager() {
    }
}
