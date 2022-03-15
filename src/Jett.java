public class Jett extends Agent{
    int dash;
    public Jett(int age,boolean alive, int dash){
        super(age,alive);
        this.dash = dash;
    }

    public int getDash(){
        return dash;
    }
    public void woosh(){
        System.out.println("woosh x"+dash);
    }

}
