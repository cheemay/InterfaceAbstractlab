/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Dell
 */
public abstract class ProgrammingCourse  {
    private String courseName;//all this line is a property
    private String courseNumber; //all this line is a property
    private double credits;
    private String prerequisites;
    //every property should have public setter and getter
    //add a final so can't change method.
    public final String getCourseName() {
        return courseName;
    }

    public abstract void setCourseName(String courseName);

    public final String getCourseNumber() {
        return courseNumber;
    }

    public abstract void setCourseNumber(String courseNumber); 
    
    public final double getCredits() {
        return credits;
    }

    public abstract void setCredits(double credits);

    public final String getPrerequisites() {
        return prerequisites;
    }

    public  void setPrerequisites(String prerequisites){
        this.prerequisites  = prerequisites;
    }
}
