public class Reyna extends Agent{
   int suck;
    public Reyna(int age,boolean alive, int suck){
        super(age, alive);
        this.suck = suck;
    }

    public void suck(){
        System.out.println("suck x" + suck);
    }

    public int getSuck() {
        return suck;
    }
}
