package org.example;

import javax.lang.model.element.Name;

public class Student {
    private String name;
    private int course;
    private String group;

    private static int totalStudents = 0;
    private static int totalCourses = 0;


    public static void vsePoly(){

        System.out.println(totalStudents+totalCourses);

    }
    public void vsePolyy(){
        System.out.println(name+course+group);
    }

    /*
    Student b=new Student(name,course,group);
    b.vsePoly();
    Student.vsePolyy();
     */
    public Student(String name, int course, String group) {
        this.name = name;
        this.course = course;
        this.group = group;

        totalStudents++;
        totalCourses += course;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        totalCourses = totalCourses - this.course + course;
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    public static int getTotalStudents() {
        return totalStudents;
    }

    public static int getTotalCourses() {
        return totalCourses;
    }


    public static double getAverageCourse() {
        if (totalStudents == 0) {
            return 0.0;
        }
        return (double) totalCourses / totalStudents;
    }
}
