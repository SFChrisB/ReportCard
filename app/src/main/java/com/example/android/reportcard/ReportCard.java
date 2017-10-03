package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by AgiChrisPC on 13/05/2017.
 */

public class ReportCard {

    //ArrayLists for both the lessons and the students scores in the lessons
    private ArrayList<String> mLessons = new ArrayList<String>();
    private ArrayList<Double> mScores = new ArrayList<Double>();

    //Initialise the other variables
    private int mStudentID;
    private int ScoresLength;
    private String mStudentName;
    private String mScoring;
    private String mGrade;

    public ReportCard(Double Physics, Double Biology, Double Chemistry, Double Maths, Double History, Double Hungarian, Double Geography,
                      Double ComputerStudies, Double Sports, Double Literature, Double Language) {

        //The ArrayLists for both the Lessons and the Scores. Left open if a the courses change in later years. Int created to track the length of the size
        mScores.add(0, Physics);
        mScores.add(1, Biology);
        mScores.add(2, Chemistry);
        mScores.add(3, Maths);
        mScores.add(4, History);
        mScores.add(5, Hungarian);
        mScores.add(6, Geography);
        mScores.add(7, ComputerStudies);
        mScores.add(8, Sports);
        mScores.add(9, Literature);
        mScores.add(10, Language);

        mLessons.add(0, "Physics");
        mLessons.add(1, "Biology");
        mLessons.add(2, "Chemistry");
        mLessons.add(3, "Maths");
        mLessons.add(4, "History");
        mLessons.add(5, "Hungarian");
        mLessons.add(6, "Geography");
        mLessons.add(7, "Computer Studies");
        mLessons.add(8, "Sports");
        mLessons.add(9, "Literature");
        mLessons.add(10, "Languages");

        ScoresLength = mScores.size();
    }

    //Setters and getters for the subjects and student scores.
    //Lesson 0
    public void setmPhysics(double physics) {
        this.mScores.set(0, physics);
    }

    private double getmPhysics() {
        return mScores.get(0);
    }

    //Lesson 1
    public void setmBiology(double biology) {
        this.mScores.set(1, biology);
    }

    private double getmBiology() {
        return mScores.get(1);
    }

    //Lesson 2
    public void setmChemistry(double chemistry) {
        this.mScores.set(2, chemistry);
    }

    private double getmChemistry() {
        return mScores.get(2);
    }

    //Lesson 3
    public void setmMaths(double maths) {
        this.mScores.set(3, maths);
    }

    private double getmMaths() {
        return mScores.get(3);
    }

    //Lesson 4
    public void setmHistory(double history) {
        this.mScores.set(4, history);
    }

    private double getmHistory() {
        return mScores.get(4);
    }

    //Lesson 5
    public void setmHungarian(double hungarian) {
        this.mScores.set(5, hungarian);
    }

    private double getmHungarian() {
        return mScores.get(5);
    }

    //Lesson 6
    public void setmGeography(double geography) {
        this.mScores.set(6, geography);
    }

    private double getmGeography() {
        return mScores.get(6);
    }

    //Lesson 7
    public void setmComputerStudies(double comStudies) {
        this.mScores.set(7, comStudies);
    }

    private double getmComputerStudies() {
        return mScores.get(7);
    }

    //Lesson 8
    public void setmSports(double sports) {
        this.mScores.set(8, sports);
    }

    private double getmSports() {
        return mScores.get(8);
    }

    //Lesson 9
    public void setmLiterature(double literature) {
        this.mScores.set(9, literature);
    }

    private double getmLiterature() {
        return mScores.get(9);
    }

    //Lesson 10
    public void setmLanguage(double language) {
        this.mScores.set(10, language);
    }

    private double getmLanguage() {
        return mScores.get(10);
    }

    //Getters and setters for the StudentNames and StudentID's
    public void setmStudentName(String StudentName) {
        this.mStudentName = StudentName;
    }

    private String getmStudentName() {
        return mStudentName;
    }

    public void setmStudentID(int StudentID) {
        this.mStudentID = StudentID;
    }

    private int getmStudentID() {
        return mStudentID;
    }

    //toString to output the code
    @Override
    public String toString() {
        //The student name and ID are passed first and then a 'for loop' to cycle through the different subjects and list the scoring for the student is made.
        //as well as determining whetehr the student passed or failed the lesson
        mScoring = "Student Name: " + getmStudentName() + "\nStudent ID: " + getmStudentID()
        + "\n\nSubjects:\n";

        for (int i = 0; i < ScoresLength; i++) {
            String lesson = mLessons.get(i);
            Double scores = mScores.get(i);
            //Check if student passed the designated lesson
            if (scores >= 60.0) mGrade = "Pass";
            else mGrade = "Fail";
            mScoring = mScoring + i + " " + lesson + ": " + scores + "         " + mGrade + "\n";
        }
        return mScoring;
    }
}
