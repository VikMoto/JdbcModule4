package jdbcModule4;

import jdbcModule4.selectQueries.PrintProjectPrices;
import jdbcModule4.utils.Prefs;

import java.util.List;

import static jdbcModule4.service.DatabaseQueryService.printProjectsPrice;

public class Module4Runner {
    public static void main(String[] args) {
//        List<MaxProjectCountClient> maxProjectCountClients =
//                maxProjectCountClient(Prefs.FIND_MAX_PROJECTS_CLIENT_SQL_DB_FILENAME);
//            System.out.println("MaxProjectCountClient = " + maxProjectCountClients);
//
//        List<LongestProject> longestProjects =
//                longestProject(Prefs.FIND_LONGEST_PROJECT_DB_FILENAME);
//        System.out.println("longestProjects = " + longestProjects);
//
//        List<MaxSalaryWorkers> maxSalaryWorkers =
//                maxSalaryWorker(Prefs.FIND_MAX_SALARY_WORKER_DB_FILENAME);
//
//        System.out.println("maxSalaryWorkers = " + maxSalaryWorkers);

//        List<YoungestEldestWorker> youngestEldestWorkers =
//                DatabaseQueryService.youngestEldestWorkers(Prefs.YOUNGEST_ELDEST_WORKER_DB_FILENAME);
//
//        for (YoungestEldestWorker youngestEldestWorker : youngestEldestWorkers) {
//            System.out.println(youngestEldestWorker);
//        }

        List<PrintProjectPrices> printProjectPrices =
                printProjectsPrice(Prefs.PRINT_PROJECT_PRICES_DB_FILENAME);

        for (PrintProjectPrices printProjectPrice : printProjectPrices) {
            System.out.println(printProjectPrice);
        }


    }
}
