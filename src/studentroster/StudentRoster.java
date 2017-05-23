/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentroster;
import java.util.Scanner;

/**
 * Displays a student roster.
 */  
public class StudentRoster {

       public static void main(String[] args) {
               String[] studentNames;
               int numNames;
               Scanner input = new Scanner(System.in);

               System.out.print("How many students? ");
               numNames = input.nextInt();
               studentNames = new String[numNames];

               /* get student names */
               for (int i = 0; i < numNames; i++) {
                       System.out.print("Enter student name: ");
                       studentNames[i] = input.next();
               }

               /* display roster */
               System.out.println("\nStudent Roster");
               for (int i = 0; i < numNames; i++) {
                       System.out.println(studentNames[i]);
               }
       }
}


