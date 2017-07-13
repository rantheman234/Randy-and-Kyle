/**
 * Created by Randy on 7/13/2017.
 */
import java.lang.*;
import java.util.*;
public class main {

    //add a random grade
    public static  void addGrade(student s, String type){
        if(type.toLowerCase().equals("test")){
            s.addtest(Math.random()*100);
        }
        else if(type.toLowerCase().equals("assignment")){
            s.addAssignment(Math.random()*100);
        }
        else{
            System.out.println("incompatable type, will not add grade");
        }
    }

    //add a pre-determined grade
    public static void addGrade(student s, String type, double grade){
        if(type.toLowerCase().equals("test")){
            s.addtest(grade);
        }
        else if(type.toLowerCase().equals("assignment")) {
            s.addAssignment(grade);
        }
        else{
            System.out.println("incompatable type, will not add grade");
        }
    }

    public static void main(String[] args){
        Scanner scan  =  new Scanner(System.in);
        //String[] names = {"Mary", "Susan", "Chloe", "Rachel", "Randy", "Jack","Joe","Mya","Roxy","Josh","Dequan"};


        ArrayList<student> students = new ArrayList();

        System.out.println("How many Students are in this class?");
        int studentNumber = scan.nextInt();

        String test = scan.nextLine();
        for(int i = 1; i <= studentNumber; i++){
            //students.add(new student(names[(int)(Math.random()*names.length-1)]));
            System.out.println("Enter the name of Student number: " + i);
            students.add(new student(scan.nextLine()));
        }



        for (student s: students){
            addGrade(s,"test");
            addGrade(s,"test");
            addGrade(s,"test");
        }

        for (student s: students){
            addGrade(s,"assignment");
            addGrade(s,"assignment");
            addGrade(s,"assignment");
            addGrade(s,"assignment");
        }

        for(int i =0; i <100; i++){
            System.out.println();
        }

        for(student s: students){

        System.out.println(s);
        System.out.println();
        }

//test
    }
}
