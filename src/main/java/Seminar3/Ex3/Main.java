package Seminar3.Ex3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "жёлтый", "деревянный");
        Cube cube6 = new Cube(3, "красный", "металлический");
        Cube cube5 = new Cube(3, "красный", "металлический");
        Cube cube2 = new Cube(3, "красный", "металлический");
        Cube cube3 = new Cube(4, "зелёный", "металлический");
        Cube cube4 = new Cube(2, "жёлтый", "стальной");
        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        cubeList.add(cube5);
        cubeList.add(cube6);
        System.out.println("cubeList = " + cubeList);
        Integer k = 0;
        Integer volume = 0;
        Integer kWood = 0;
        for (Cube cube : cubeList) {
           if(cube.getColor().equals("жёлтый")){
               k++;
               volume+=cube.volumeCube();
           }
           if(cube.getMaterial().equals("деревянный") && cube.getSize()==3){
               kWood++;
           }
        }
        System.out.println("k = " + k);
        System.out.println("volume = " + volume);
        System.out.println("kWood = " + kWood);
        System.out.println("unicumListCube(cubeList) = " + unicumListCube(cubeList));
    }

    /**
     *
     * @param cubeList входной список кубов
     * @return цникальная коллекция
     */
    private static Collection unicumListCube(List<Cube> cubeList) {
        return new HashSet(cubeList);
    }
}
