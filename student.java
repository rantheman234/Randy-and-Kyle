/**
 * Created by Randy on 7/13/2017.
 */
import java.util.*;
import java.lang.*;
//each student has 3 tests & 4 assignments
    // tests worth 70% of grade, assignments worth 30%
public class student {
    String name;
    int average = 0;
    ArrayList<Double> tests= new <Double>ArrayList();
    ArrayList<Double> assignments= new <Double>ArrayList();
    double allTests;
    double allAssignments;

    public student(String n){
        name  = n;
    }

    void addtest(double grade){
        if(grade < 0 || grade > 100){
            System.out.println("null");
            return;
        }
        tests.add(grade);
        allTests += grade;
        calculateAverage();

    }

    void addAssignment(double grade){
        if(grade < 0 || grade > 100){
            System.out.println("null");
            return;
        }
        assignments.add(grade);
        allAssignments += grade;
        calculateAverage();
    }

    void calculateAverage(){
        if(tests.size() > 0 && assignments.size() > 0 ) {
            double testAverage = allTests / tests.size();
            double assignmentAverage = allAssignments / assignments.size();

            double weightedtests =  testAverage * .7;
            double weightedAssignments = assignmentAverage * .3;
            average = (int)Math.round(weightedAssignments + weightedtests);
        }

    }

    public String toString(){
        String testsString = "";
        String assignmentsString = "";
        int count = 1;
        for(Double t: tests){
            testsString += "\ttest " + count + " Score: " + t.intValue() +"%";
            count++;
        }
        count = 1;
        for(Double a: assignments){
            assignmentsString += "\tassignment " + count + " Score: " + a.intValue()+"%";
            count++;
        }


    return "Average of " + name + ":\t" + average +"%" +
            "\n" + testsString +
            "\n" + assignmentsString;
    }


}