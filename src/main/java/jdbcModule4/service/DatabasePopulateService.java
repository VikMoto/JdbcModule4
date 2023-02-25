package jdbcModule4.service;

import jdbcModule4.database.DataBase;
import jdbcModule4.utils.ExecuteService;
import jdbcModule4.utils.Prefs;

public class DatabasePopulateService {
    DataBase dataBase;

    public static void main(String[] args) {
        ExecuteService.executeSqlFile(Prefs.POPULATE_INSERT_DB_FILENAME);
    }
}
