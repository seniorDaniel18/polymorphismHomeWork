package company;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Shark(), new Eagle(), new Turtle()};

        for(Animal a : animals){
            if(a instanceof Shark){
                ((Shark) a).attack();
            }
            if (a.getClass().getName().equals("company.Shark")) {
                ((Shark) a).attack();
            }
        }
        System.out.println("-----------------");

        for(Animal b : animals){
            if(b instanceof Eagle){
                ((Eagle) b).fly();
            }
            if(b.getClass().getName().equals("company.Eagle")){
                ((Eagle) b).fly();
            }
        }
        System.out.println("-----------------");

        for(Animal c : animals){
            if(c instanceof Turtle){
                ((Turtle) c).swim();
            }
            if(c.getClass().getName().equals("company.Turtle")){
                ((Turtle) c).swim();
            }
        }

        System.out.println("+++++++++++++++");

        Shark[] sharks = {new Shark()};
        for(Animal a : animals){
            if(a instanceof Shark){
                ((Shark) a).attack();
            }
            if (a.getClass().getName().equals("company.Shark")) {
                ((Shark) a).attack();
            }
        }

        System.out.println("-----------------");

        Eagle[] eagles = {new Eagle()};

        for(Animal b : animals){
            if(b instanceof Eagle){
                ((Eagle) b).fly();
            }
            if(b.getClass().getName().equals("company.Eagle")){
                ((Eagle) b).fly();
            }
        }

        System.out.println("-----------------");

        Turtle[] turtles = {new Turtle()};

        for(Animal c : animals){
            if(c instanceof Turtle){
                ((Turtle) c).swim();
            }
            if(c.getClass().getName().equals("company.Turtle")){
                ((Turtle) c).swim();
            }
        }
}
}