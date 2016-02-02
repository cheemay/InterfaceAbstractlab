/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Yasir Cheema
 */
public class Startup {
    public static void main1(String[] args) {
        ProgrammingCourse [] programming = {new IntroToProgrammingCourse(), new IntroJavaCourse(),
                                            new AdvancedJavaCourse()};
        
        programming[0].setPrerequisites("Basics of computer");
        programming[1].setPrerequisites("Intro to Programing");
        programming[2].setPrerequisites("Intro to Java");
      
        for(ProgrammingCourse p : programming){
            System.out.println(p.getPrerequisites());
        }
        
        }
        
    }
    

