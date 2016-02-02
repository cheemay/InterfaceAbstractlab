package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {

    @Override
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0){
            JOptionPane.showMessageDialog(null, "Error: courseName cannot be null of emply string");
            System.exit(0);
        }
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0){
            JOptionPane.showMessageDialog(null, "Error: CourseNumber cannot be null of empty string");
            System.exit(0);
        } 
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0){
            JOptionPane.showMessageDialog(null, "Error: Credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0){
            JOptionPane.showMessageDialog(null, "Error: Prerequisites can't be null of empty strings");
            System.exit(0);
        }  else{
            super.setPrerequisites(prerequisites);
        }
    }  
}
