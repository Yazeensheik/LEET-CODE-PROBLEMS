package oops_inheritance;

public class SalaryEg{

    // Person class
    static class Person {
        private String name;

        // Default constructor
        public Person() {
            this.name = "";
        }

        // Parameterized constructor
        public Person(String name) {
            this.name = name;
        }

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String name) {
            this.name = name;
        }
    }

    // Employee class extending Person
    static class Employee extends Person {
        private double annualSalary;
        private int yearStarted;
        private String nationalInsuranceNumber;

        // Default constructor
        public Employee() {
            super();
            this.annualSalary = 0.0;
            this.yearStarted = 0;
            this.nationalInsuranceNumber = "";
        }

        // Parameterized constructor
        public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
            super(name);
            this.annualSalary = annualSalary;
            this.yearStarted = yearStarted;
            this.nationalInsuranceNumber = nationalInsuranceNumber;
        }

        // Getter and Setter for annualSalary
        public double getAnnualSalary() {
            return annualSalary;
        }

        public void setAnnualSalary(double annualSalary) {
            this.annualSalary = annualSalary;
        }

        // Getter and Setter for yearStarted
        public int getYearStarted() {
            return yearStarted;
        }

        public void setYearStarted(int yearStarted) {
            this.yearStarted = yearStarted;
        }

        // Getter and Setter for nationalInsuranceNumber
        public String getNationalInsuranceNumber() {
            return nationalInsuranceNumber;
        }

        public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
            this.nationalInsuranceNumber = nationalInsuranceNumber;
        }
    }

    // Main class to test Employee class
    public static void main(String[] args) {
        // Create an Employee object using the parameterized constructor
        Employee emp = new Employee("John Doe", 50000.0, 2015, "AB123456C");

        // Display employee details
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        // Modify and display employee details using setter methods
        emp.setAnnualSalary(55000.0);
        emp.setYearStarted(2016);
        emp.setNationalInsuranceNumber("CD789012E");

        System.out.println("\nUpdated Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());
    }
}