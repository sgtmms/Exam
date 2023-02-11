package org.example;


import org.example.DAO.ReportDAO;

public class Main {
    public static void main(String[] args) {
        Integer weekFive = 5;
        ReportDAO reportDAO = new ReportDAO();
        reportDAO.getDepartmentPayForASelectedWeek(weekFive);
        reportDAO.getEmployeeByDepartmentHourlyRate();
        reportDAO.getEmployeePayForASelectedWeekSQL(weekFive);
    }
}