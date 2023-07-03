package OOP.oop2.Lesson_08.Ex005.v1;

import OOP.oop2.Lesson_08.Ex005.v1.Healers.Druid;
import OOP.oop2.Lesson_08.Ex005.v1.Healers.Healer;
import OOP.oop2.Lesson_08.Ex005.v1.Healers.Shaman;
import OOP.oop2.Lesson_08.Ex005.v1.Warriors.Knight;
import OOP.oop2.Lesson_08.Ex005.v1.Warriors.Paladin;
import OOP.oop2.Lesson_08.Ex005.v1.Warriors.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        //#region team1
        List<Hero> team1 = new ArrayList<>();
        team1.add(new Druid());
        team1.add(new Shaman());
        team1.add(new Paladin());
        team1.add(new Druid());

        // team1.get(0).attack

        var h = team1.get(0);

        if (h instanceof Warrior) {
            ((Warrior) h).attack(null);
        }
        else if (h instanceof Healer) {
            ((Healer) h).healing(null);
        } else {
            //....
        }
        //#endregion

        //#region team2
        List<Warrior> team2 = new ArrayList<>();
        //team2.add(new Druid());
        team2.add(new Paladin());
        team2.add(new Knight());

        team2.get(0).attack(null);

        List<Healer> team3 = new ArrayList<>();
        //team2.add(new Paladin());
        team3.add(new Druid());
        team3.add(new Shaman());

        team3.get(0).healing(null);


        //#endregion



    }
}
