package org.example.DAO;

import org.example.Models.DepartmentPayForASelectedWeek;
import org.example.Models.EmployeeByDepartmentHourlyRate;
import org.example.Models.EmployeePayForASelectedWeek;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReportDAO {
    private Connection connection = null;
    private PreparedStatement ptmt = null;
    private ResultSet resultSet = null;

    private SQLSelectStrings sqlSelectStrings = null;


    public ReportDAO() {
        sqlSelectStrings = new SQLSelectStrings();
    }


    private Connection getConnection() throws SQLException {
        Connection conn;
        conn = ConnectionFactory.getInstance().getConnection();
        return conn;
    }

    public ArrayList<EmployeePayForASelectedWeek> getEmployeePayForASelectedWeekSQL(Integer weekNumber, Integer year) {
        ArrayList<EmployeePayForASelectedWeek> employeePaysForASelectedWeek = new ArrayList<>();

        try {
            String queryString = sqlSelectStrings.getEmployeePayForASelectedWeekSQL();
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setInt(1, weekNumber);
            ptmt.setInt(2, year);
            resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                EmployeePayForASelectedWeek employeePayForASelectedWeek = new EmployeePayForASelectedWeek();
                employeePayForASelectedWeek.setPayForTheWeek(resultSet.getFloat("PAY_FOR_SELECTED_WEEK"));
                employeePayForASelectedWeek.setFirstName(resultSet.getString("FIRST_NAME"));
                employeePayForASelectedWeek.setLastName(resultSet.getString("LAST_NAME"));

                employeePaysForASelectedWeek.add(employeePayForASelectedWeek);
                System.out.println(employeePayForASelectedWeek.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (ptmt != null)
                    ptmt.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        return employeePaysForASelectedWeek;
    }

    public ArrayList<DepartmentPayForASelectedWeek> getDepartmentPayForASelectedWeek(Integer weekNumber, Integer year) {
        ArrayList<DepartmentPayForASelectedWeek> departmentPaysForASelectedWeek = new ArrayList<>();

        try {
            String queryString = sqlSelectStrings.getDepartmentPayForASelectedWeek();
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setInt(1, weekNumber);
            ptmt.setInt(2, year);
            resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                DepartmentPayForASelectedWeek departmentPayForASelectedWeek = new DepartmentPayForASelectedWeek();
                departmentPayForASelectedWeek.setPayForTheWeek(resultSet.getFloat("PAY_FOR_SELECTED_WEEK"));
                departmentPayForASelectedWeek.setDepartmentName(resultSet.getString("DEPARTMENT"));
                departmentPaysForASelectedWeek.add(departmentPayForASelectedWeek);
                System.out.println(departmentPayForASelectedWeek.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (ptmt != null)
                    ptmt.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        return departmentPaysForASelectedWeek;
    }

    public ArrayList<EmployeeByDepartmentHourlyRate>getEmployeeByDepartmentHourlyRate() {
        ArrayList<EmployeeByDepartmentHourlyRate> employeeByDepartmentHourlyRates = new ArrayList<>();

        try {
            String queryString = sqlSelectStrings.getEmployeeByDepartmentHourlyRate();
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);

            resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                EmployeeByDepartmentHourlyRate employeeByDepartmentHourlyRate = new EmployeeByDepartmentHourlyRate();
                employeeByDepartmentHourlyRate.setDepartmentName(resultSet.getString("DEPT_NAME"));
                employeeByDepartmentHourlyRate.setFirstName(resultSet.getString("FIRST_NAME"));
                employeeByDepartmentHourlyRate.setLastName(resultSet.getString("LAST_NAME"));
                employeeByDepartmentHourlyRate.setHourlyRate(resultSet.getFloat("HOURLY_RATE"));
                employeeByDepartmentHourlyRates.add(employeeByDepartmentHourlyRate);
                System.out.println(employeeByDepartmentHourlyRate.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (ptmt != null)
                    ptmt.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        return employeeByDepartmentHourlyRates;
    }


}
