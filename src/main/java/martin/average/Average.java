/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package martin.average;

/**
 *
 * @author MARTIN.R
 */
import javax.swing.*;
public class Average {

    public static void main(String[] args) {
    String studName,studGrade,term;
    int engMark, afrMark, mathMark, geoMark, historyMark, catMark, loMark;
    
    studName = JOptionPane.showInputDialog("Please enter your students name: ");
    studGrade = JOptionPane.showInputDialog("Please enter your students grade: ");
    
    //Prompting the user to select the average they want to calculate 
    String choice = JOptionPane.showInputDialog("What would you like to do" + "\n" + "1)Current Term Average" + "\n" + "2)Year Average");
    term = JOptionPane.showInputDialog("Please enter the current term: ");
    
    if (choice.equals("1")){
    engMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter your students English mark(%): "));
    afrMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter your students Afrikaans mark(%): "));
    mathMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter your students Math mark(%): "));
    geoMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter your students geo mark(%): "));
    historyMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter your students History mark(%): "));
    catMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter your students CAT mark(%): "));
    loMark = Integer.parseInt(JOptionPane.showInputDialog("Please enter your students LO mark(%): "));
    
    System.out.println("Name:\t" + studName  );
    System.out.println("Grade:\t" + studGrade );
    System.out.println("Eng:\t" + engMark  );
    System.out.println("Afr\t" + afrMark );
    System.out.println("Math:\t" + mathMark  );
    System.out.println("Geo:\t" + geoMark );
    System.out.println("hist:\t" + historyMark  );
    System.out.println("CAT:\t" + catMark );
    System.out.println("LO:\t" + loMark );
    
    double average = ((engMark + afrMark + mathMark + geoMark + historyMark + catMark + loMark) / 7);
    
    System.out.println("Term: " + term + " Average:" + average );
    }else{
    int term1,term2,term3,term4;
    
    
    //Prompting the user to enter their average per term
    term1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your Term 1 average: "));
    term2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your Term 2 average: "));
    term3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your Term 3 average: "));
    term4 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your Term 4 average: "));
    
    double Yearaverage= ((term1 +term2+term3+term4)/4);
    
    System.out.println("Year average" + Yearaverage );
    }
    }
}
