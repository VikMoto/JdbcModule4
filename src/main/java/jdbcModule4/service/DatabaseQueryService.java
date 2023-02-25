package jdbcModule4.service;

import jdbcModule4.selectQueries.*;
import jdbcModule4.utils.ExecuteService;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static jdbcModule4.service.DatabaseInitService.Database;

public class DatabaseQueryService {


    public static List<PrintProjectPrices> printProjectsPrice(String pathSql) {
        List<PrintProjectPrices> result = new ArrayList<>();

        try (Connection conn = Database.getInstance().getConnection();
             Statement statement = conn.createStatement()) {

//            System.out.println("pathSql = " + pathSql);

            String sql = ExecuteService.readFileSql(pathSql);

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String clientName = resultSet.getString("client_name");
                long projectId = resultSet.getLong("pr_id");
                long salary = resultSet.getLong("salary");
                long intervalInMonth = resultSet.getLong("interval_month");
                long totalCost = resultSet.getLong("TOTAL");

                result.add(new PrintProjectPrices(clientName, projectId, salary, intervalInMonth, totalCost));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return  result;
    }


    public static List<YoungestEldestWorker> youngestEldestWorkers(String pathSql) {
        List<YoungestEldestWorker> result = new ArrayList<>();

        try (Connection conn = Database.getInstance().getConnection();
             Statement statement = conn.createStatement()) {

//            System.out.println("pathSql = " + pathSql);

            String sql = ExecuteService.readFileSql(pathSql);

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String type = resultSet.getString("TYPE");
                String name = resultSet.getString("name");
                String birthday = resultSet.getString("birthday");

                result.add(new YoungestEldestWorker(type,name,birthday));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return  result;
    }
    public static List<MaxSalaryWorkers> maxSalaryWorker(String pathSql) {
        List<MaxSalaryWorkers> result = new ArrayList<>();

        try (Connection conn = Database.getInstance().getConnection();
             Statement statement = conn.createStatement()) {

//            System.out.println("pathSql = " + pathSql);

            String sql = ExecuteService.readFileSql(pathSql);

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                long salary = resultSet.getLong("salary");
                result.add(new MaxSalaryWorkers(name,salary));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return  result;
    }

    public static List<LongestProject> longestProject(String pathSql) {
        List<LongestProject> result = new ArrayList<>();

        try (Connection conn = Database.getInstance().getConnection();
             Statement statement = conn.createStatement()) {

//            System.out.println("pathSql = " + pathSql);

            String sql = ExecuteService.readFileSql(pathSql);

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                long project_id = resultSet.getLong("project_id");
                long timeMonth = resultSet.getLong("timeMonth");
                result.add(new LongestProject(name,project_id,timeMonth));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return  result;
    }
    public static List<MaxProjectCountClient> maxProjectCountClient(String pathSql) {
        List<MaxProjectCountClient> result = new ArrayList<>();

        try (Connection conn = Database.getInstance().getConnection();
             Statement statement = conn.createStatement()) {

//            System.out.println("pathSql = " + pathSql);

            String sql = ExecuteService.readFileSql(pathSql);

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String name = resultSet.getString("c_lient");
                int client_max = resultSet.getInt("client_max");
                result.add(new MaxProjectCountClient(name,client_max));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return  result;
    }

}

