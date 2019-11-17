
import java.util.ArrayList;


public class Course {
    
    private ArrayList<Exam> exams;
    private double acceptance;
    
    public Course(){
        this.exams = new ArrayList<Exam>();
        
    }
    
    public void addExam(int score){
        Exam exam = new Exam(score);
        
        if(exam.isValidScore(score)){
            this.exams.add(exam);
        } else {
            System.out.println("Not a valid Exam");
        }        
    }
    
    public void gradeDistribution() {
        
        System.out.println("");
        System.out.println("Grade distribution: ");
        
        for (int i = 5; i >= 0; i--){
            System.out.print(i + ": ");
            
            for(int j = 0; j < exams.size(); j++){
                if(exams.get(j).getGrade() == i){
                    System.out.print("*");
                }
            }
            
            System.out.println("");
        }
        
    }
    
    public double acceptance() {
        int accepted = 0;
        double allScores = 0;
        
        for(Exam exam : exams) {
            if(exam.getGrade() > 0){
                accepted++;
            }
            
            allScores++;
        }
        
        return 100*accepted/allScores;
    }
    
}
