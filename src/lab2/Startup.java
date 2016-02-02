/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
/**
 *
 * @author Dell
 */
public class Startup {
    public static void main(String[] args) {
            ProgrammingCourse []programing =  {new IntroToProgrammingCourse(), 
                                                new IntroJavaCourse(),
                                                new AdvancedJavaCourse()};

            programing[0].setCourseName("Introduction to Programing");
            programing[0].setCourseNumber("The course number is 15320");
            programing[0].setCredits(4);
            programing[0].setprerequisites("Basic computer");
            
            programing[1].setCourseName("Introduction to Java");
            programing[1].setCourseNumber("The course number is 15321");
            programing[1].setCredits(4);
            programing[1].setprerequisites("Basic Programming");
            
            programing[2].setCourseName("Advanced Java");
            programing[2].setCourseNumber("The course number is 15322");
            programing[2].setCredits(4);
            programing[2].setprerequisites("Basic java");
            
            for(ProgrammingCourse p : programing){
                System.out.println("------------------------");
                System.out.println(p.getCourseName());
                System.out.println("------------------------");
                System.out.println(p.getCourseNumber());
                System.out.println(p.getCredits());
                System.out.println(p.getPrerequisites());
                System.out.println("------------------------\n");
            }
    }
}