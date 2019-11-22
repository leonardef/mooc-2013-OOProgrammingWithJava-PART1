
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leonarde
 */
public class BirdDatabase {
    
    private ArrayList<Bird> birdList;
    
    public BirdDatabase() {
        this.birdList = new ArrayList<Bird>();
    }
    
    public void add(String name, String latinName) {
        birdList.add(new Bird(name, latinName));
    
    }
    
    public void observation(String name) {
        for(Bird bird : birdList) {
            if(bird.getName().contains(name)){
                bird.addObservation();
            } else {
                System.out.println("Not a bird");
            }
        }
    }
    
    public void statistics(){
        
        for(Bird bird : birdList) {
            System.out.println(bird);
        }
    }
    
    public void show(String name) {
        for(Bird bird : birdList) {
            if(bird.getName().contains(name)){
                System.out.println(bird);
            }
        }
    }
    
}
