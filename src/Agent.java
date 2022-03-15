public class Agent {
  int age;
  boolean alive;
    public Agent(int age,boolean alive){
        this.age = age;
        this.alive = alive;
    }
    public void walk(){
        System.out.println("footstep");
    }
    public void shoot(){
        System.out.println("bang");
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return alive;
    }
}
