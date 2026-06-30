package LLD;

import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(int score);
}

class MobileApp implements Observer{
    public void update(int score){
        System.out.println("viewing the score:"+score);
    }
}

class TV implements Observer{
    public void update(int score){
        System.out.println("viewing the score:"+score);
    }
}

class ScoreServer{
    List<Observer>observers=new ArrayList<>();

    void subsribe(Observer observer){
        observers.add(observer);
    }

     public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
    
    void setScore(int score){
        System.out.println("updating the score:"+score);

        for(Observer observer:observers){
            observer.update(score);
        }
    }
}


public class ObserverPattern {
    public static void main(String[] args){
            ScoreServer scoreServer=new ScoreServer();
            scoreServer.subsribe(new MobileApp());
            scoreServer.subsribe(new TV());

            scoreServer.setScore(100);
            scoreServer.setScore(300);
    }
}
