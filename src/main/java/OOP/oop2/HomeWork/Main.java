package OOP.oop2.HomeWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Actions> heroes = new ArrayList<>();
        Human human = new Human("Вася", 300, 1.5);
        Cat cat = new Cat("Барсик", 50, 0.6);
        Robot robot = new Robot("R2D2", 1000, 0.1);
        heroes.add(human);
        heroes.add(cat);
        heroes.add(robot);
        for (Object hero : heroes) {
            System.out.println(hero);
        }
        System.out.println("-----------");
        ArrayList<Obstacles> obstacles = new ArrayList<>();
        Wall wall1 = new Wall(0.1);
        Wall wall2 = new Wall(1.2);
        Wall wall3 = new Wall(1.3);
        Treadmill treadmill1 = new Treadmill(10);
        Treadmill treadmill2 = new Treadmill(100);
        Treadmill treadmill3 = new Treadmill(300);
        obstacles.add(wall1);
        obstacles.add(wall2);
        obstacles.add(wall3);
        obstacles.add(treadmill1);
        obstacles.add(treadmill2);
        obstacles.add(treadmill3);
        for (Object obstacle : obstacles) {
            System.out.println(obstacle);
        }
        System.out.println("-----------");
        for (int i = 0; i < heroes.size(); i++) {
            for (Object obstacle : obstacles) {
                if(obstacle instanceof Wall) {
                    heroes.get(i).jump(((Wall) obstacle).getHeight());
                    if(heroes.get(i).getFlag()){
                        System.out.println("Участник " + heroes.get(i).getName() + " сошёл");
                        heroes.remove(heroes.get(i));
                        i--;
                        break;
                    }
                }else {
                    heroes.get(i).run(((Treadmill) obstacle).getDistance());
                    if(heroes.get(i).getFlag()){
                        System.out.println("Участник " + heroes.get(i).getName() + " сошёл");
                        heroes.remove(heroes.get(i));
                        i--;
                        break;
                    }
                }
            }
        }
    }
}
