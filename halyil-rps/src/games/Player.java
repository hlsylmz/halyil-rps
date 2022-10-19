package games;

public class Player {
    private int score;
    private String name;
    //constructor
    public Player(String name, int score){
        this.name=name;
        this.score=score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
