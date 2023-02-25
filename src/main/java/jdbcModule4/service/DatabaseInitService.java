package jdbcModule4.service;

import jdbcModule4.database.DataBase;
import jdbcModule4.utils.ExecuteService;
import jdbcModule4.utils.Prefs;

public class DatabaseInitService {
    public static DataBase Database;


    public static void main(String[] args) {
        ExecuteService.executeSqlFile(Prefs.INIT_DB_FILENAME);
    }

}
