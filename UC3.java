package com.bridgelabz.program.Day9.EmpWage;

public class UC3 {
    public static void main(String args[])
    {
        int is_fulltime_present = 1;
        int is_parttime_present = 2;
        int daily_wage;
        int wage_per_hr = 20;
        int working_hr;
        int emp_check = (int)(Math.floor(Math.random() * 10)) % 3;
        if( emp_check == is_fulltime_present)
        {
            System.out.println("Wage is full time present");
            working_hr = 8;
        }
        else if( emp_check == is_parttime_present)
        {
            System.out.println("Wage is part time present");
            working_hr = 4;
        }
        else
        {
            System.out.println("Wage is absent");
            working_hr = 0;
        }

        daily_wage = working_hr * wage_per_hr;
        System.out.println("Wage daily wage is " + daily_wage);
    }
}
