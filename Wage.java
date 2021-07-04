package com.bridgelabz.program.Day9.EmpWage;

    /**
     * Refactoring the EmployeeWage for multiple Company
     * using seperate object for each company to calculate employee wage.
     */
    public class Wage {
        private static final int IS_FUllTime = 1;
        private static final int IS_PARTTIME = 2;
        private static final int IS_ABSENT = 0;
        private String companyName;
        private int max_working_hrs;
        private int days_in_month;
        private int wage_per_hr;
        Wage(String companyName, int max_working_hrs, int days_in_month, int wage_per_hr) {
            this.companyName = companyName;
            this.max_working_hrs = max_working_hrs;
            this.days_in_month = days_in_month;
            this.wage_per_hr = wage_per_hr;
        }

        public static void main(String[] args) {

            Wage e1 = new Wage("d-mart", 100, 20, 100);
            Wage e2 = new Wage("jio-Mart", 150, 25, 110);
            e1.employeeWage();
            e2.employeeWage();
        }

        // Checking the employee attendance and paying salary based on their working hours
        void employeeWage() {
            int working_hr = 0;
            int total_working_hr = 0;
            int monthly_total_wage = 0;
            int daily_wage_array[] = new int[days_in_month];
            int days = 0;
            while (days < days_in_month && total_working_hr < max_working_hrs) {
                int emp_check = (int) (Math.floor(Math.random() * 10)) % 3;
                switch (emp_check) {
                    case IS_FUllTime -> {
                        working_hr = 8;
                    }
                    case IS_PARTTIME -> {
                        working_hr = 4;
                    }
                    case IS_ABSENT -> {
                        working_hr = 0;
                    }
                }
                total_working_hr += working_hr;
                daily_wage_array[days] = working_hr * wage_per_hr;
                days++;
            }
            for (int j = 0; j < days_in_month; j++) {
                int day = j + 1;
                System.out.println("Day " + day + " wage is " + daily_wage_array[j]);
                monthly_total_wage = monthly_total_wage + daily_wage_array[j];
            }
            System.out.println("Monthly wage for " + companyName + " : " + monthly_total_wage + "\n");
        }
    }

