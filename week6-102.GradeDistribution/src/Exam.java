
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leonarde
 */
public class Exam {

    private int score;
    private int grade;
    
    public Exam(int score) {
        this.score = score;
        this.grade = examGrade();
    }

    public int getScore() {
        return this.score;
    }
    
    public int getGrade() {
        return this.grade;
    }
    
    public int examGrade() {
        if(this.score >= 0 && this.score < 30) {
            this.grade = 0;
        } else if(this.score < 35) {
            this.grade = 1;
        } else if(this.score < 40) {
            this.grade = 2;
        } else if(this.score < 45) {
            this.grade = 3;
        } else if(this.score < 50) {
            this.grade = 4;
        } else if(this.score <= 60) {
            this.grade = 5;
        }
        
        return this.grade;
    }
    
    public boolean isValidScore(int score) {
        Exam exam = new Exam(score);
        
        if(exam.getScore() < 0 || exam.getScore() > 60){
            return false;
        }
        
        return true;
    }
    
}
