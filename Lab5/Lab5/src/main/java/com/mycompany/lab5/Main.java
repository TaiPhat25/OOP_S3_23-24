/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab5;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    static Scanner obj = new Scanner(System.in);

    public static void main(String[] args) {
//        School s1 = new School();
//        s1.ReadFile();
//        int x;
//        do {
//            System.out.println("What Do You Want To Do?");
//            System.out.println("1. Add College Students");
//            System.out.println("2. Add University Students");
//            System.out.println("3. Remove A Student");
//            System.out.println("4. Print Student List");
//            System.out.println("5. Print Graduation Students");
//            System.out.println("6. Sort");
//            System.out.println("7. Find Student By Name");
//            System.out.println("8. Exit");
//            x = obj.nextInt();
//            switch (x) {
//                case 1 -> {
//                    s1.AddCollege();
//                    s1.WriteFile();
//                    break;
//                }
//                case 2 -> {
//                    s1.AddUniversity();
//                    s1.WriteFile();
//                    break;
//                }
//                case 3 -> {
//                    s1.RemoveStudent();
//                    s1.WriteFile();
//                    break;
//                }
//                case 4 -> {
//                    s1.Print();
//                    break;
//                }
//                case 5 -> {
//                    s1.GraduationStudent();
//                    break;
//                }
//                case 6 -> {
//                    s1.Sort();
//                    s1.WriteFile();
//                    break;
//                }
//                case 7 -> {
//                    s1.FindStudent();
//                    s1.WriteFile1();
//                    break;
//                }
//                case 8 -> {
//                    System.out.println("Finished");
//                }
//            }
//        } while (x != 8);

        StaffManagement st1 = new StaffManagement();
        st1.readFile();
        int x;
        do {
            System.out.println("What Do You Want To Do?");
            System.out.println("1. Add Staff");
            System.out.println("2. Edit Staff Information");
            System.out.println("3. Remove Staff From The List");
            System.out.println("4. Calculate Total Salary Of All Staff");
            System.out.println("5. Statistic Total Salary Of Staff By Type Of Staff");
            System.out.println("6. Print The 3 Highest Paid Staff");
            System.out.println("7. Exit");
            x = obj.nextInt();
            switch (x) {
                case 1 -> {
                    int k;
                    do {
                        System.out.println("What Kind Of Staff Do You Want To Add?");
                        System.out.println("1. Add Lecture");
                        System.out.println("2. Add Teaching Assistant");
                        System.out.println("3. Add Researcher");
                        System.out.println("4. Add Specialist");
                        System.out.println("5. Exit");
                        k = obj.nextInt();
                        switch (k) {
                            case 1 -> {
                                st1.addLecture();
                                st1.writeFile();
                                break;
                            }
                            case 2 -> {
                                st1.addTeachingAssistant();
                                st1.writeFile();
                                break;
                            }
                            case 3 -> {
                                st1.addResearcher();
                                st1.writeFile();
                                break;
                            }
                            case 4 -> {
                                st1.addSpecialist();
                                st1.writeFile();
                                break;
                            }
                            case 5 -> {
                                System.out.println("Exiting.....");
                            }
                        }
                    } while (x != 5);
                }
                case 2 -> {

                }
            }
        } while (x != 7);
    }
}
