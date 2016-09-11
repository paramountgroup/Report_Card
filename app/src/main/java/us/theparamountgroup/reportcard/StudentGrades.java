package us.theparamountgroup.reportcard;

/**
 * Created by Bob Ingram on 9/3/2016. Inspired in part by the structure provided in the Udacity Android Flavor App
 * package com.example.android.flavor; stackoverflow question by user2673161.
 *
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

public class StudentGrades {


    // Name of the student (e.g. Bob Ingram, Elon Musk, Sebastian Thrun)
  //  private String studentName;

    // Name of the letter grade in the class (e.g. A,B,C,D,F)
    private String courseGrade;

    // Subject (e.g. Android Basics Nanodegree, Front End Web Developer, Google Analytics)
    private String subject;
    // gpa ( the calculated GPA based on course grades provided)
    private int gpa;

    /*
    * Create a new StudentGrades object.
    *
    * @param cSubject is the name of the subject (e.g. Android Basics Nanodegree)
    * @param cLetterGrade is the letter of the grade received (e.g. A,B,C,D,F)
    * @param cgpa is the double calculated value of GPA
    * */
    public void StudentGrades(String cSubject, String cLetterGrade, int cgpa)
    {
        subject = cSubject;
        courseGrade = cLetterGrade;
        gpa = cgpa;
    }

    /**
     * Get the name of the Android version
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Get the course grade
     */
    public String getCourseGrade() {
        return courseGrade;
    }

    /**
     * Get the gpa
     */
    public int getGpa() {
        return gpa;
    }

    /*
    Calculate GPA
     */

/*
    String grades = "";
    int total = 0;
    int dec;
    for (int j = 0; j < classes; j++) {
        Scanner inputters = new Scanner(System.in);
        System.out.print("What is your Grade?: ");
        grades = inputters.nextLine();
        if (grades.equals("A")){ dec = 4; total += dec; }
        else if (grades.equals("B")){ dec = 3; total += dec; }
        else if (grades.equals("C")){ dec = 2; total += dec; }
        else if (grades.equals("D")){ dec = 1; total += dec; }
        else if (grades.equals("F")){ dec = 0; total += dec; } }
    double GPA = total / classes; System.out.println(GPA);
    DecimalFormat formatter = new DecimalFormat("0.##");
    System.out.println( formatter.format(GPA));
    */

}
