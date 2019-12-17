package org.eclipse.che.examples;

class Movie {
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "no plot";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens stuff";
    }
}

class MazeRunner extends Movie {
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "runs a maze";
    }
}

class StarWars extends Movie {
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot(){
        return "Jedis";
    }
}

class Forgetable extends Movie {
    public Forgetable(){
        super("Forgetable");
    }
    /*
    public String plot(){
        return "Jedis";
    }
    */
}

public class Main {
    public static void main(String[] args) {
        for (int i=1; i<=11;i++){
            Movie movie =  randomMovie();
            System.out.println("Movie " + i + ": " + movie.getName() + ", Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int ramdomNumber = (int)((5 * Math.random()) + 1);
        System.out.println("ramdomNumber " + ramdomNumber);

        switch (ramdomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}