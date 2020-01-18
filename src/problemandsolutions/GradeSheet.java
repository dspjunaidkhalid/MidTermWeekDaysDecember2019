package problemandsolutions;
import java.util.*;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.


    public static void main(String[] args) {
        showGrade();

    }
    static void showGrade(){

        float quiz_score, mid_score,final_score,avg;
        Scanner sc=new Scanner(System.in);
        System.out.print("Quiz score:");
        quiz_score=sc.nextFloat();
        System.out.print("Mid-term score:");
        mid_score=sc.nextFloat();
        System.out.print("Final score:");
        final_score=sc.nextFloat();
        avg=(quiz_score+mid_score+final_score)/3;

        if(avg>=90) System.out.println("Your grade A.");
        else if((avg>=70) && (avg<90)) System.out.println("Your grade B.");
        else if((avg>=50) && (avg<70)) System.out.println("Your grade C.");
        else if(avg<50) System.out.println("Your grade F.");
        else System.out.println("Invalid");


    }


}
