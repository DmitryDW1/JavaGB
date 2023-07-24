package OOP.oop6.z2.homeWork.cw3refactor.view;

import OOP.oop6.z2.homeWork.cw3refactor.controller.Controller;
import OOP.oop6.z2.homeWork.cw3refactor.controller.ControllerNewVersion;

import java.util.List;

public class View {
    Controller controller;
    ControllerNewVersion controllerNewVersion;
    List<? extends Number> numberList;
    List<? extends Number> integerList;
    List<? extends Number> doubleList;
    List<? extends Number> floatList;
    List<String> stringList;

    public View(Controller controller, ControllerNewVersion controllerNewVersion, List<Double> doubleList, List<Integer> integerList, List<Number> numberList,
                List<Float> floatList, List<String> stringList) {
        this.controller = controller;
        this.controllerNewVersion = controllerNewVersion;
        this.numberList = numberList;
        this.integerList = integerList;
        this.doubleList = doubleList;
        this.floatList = floatList;
        this.stringList = stringList;
    }
    public void init(){
        System.out.println("calculator.sum(numberList) = " + controller.sum(numberList));
        System.out.println("calculator.sum(integerList) = " + controllerNewVersion.sum(integerList));
        System.out.println("calculator.sum(doubleList) = " + controllerNewVersion.sum(doubleList));
//        System.out.println("calculator.multiplication(numberList) = " + controller.multiplication(numberList));
        System.out.println("calculator.multiplication(numberList) = " + controllerNewVersion.multiplication(numberList));
        System.out.println("calculator.division(numberList) = " + controllerNewVersion.division(numberList));
        System.out.println("calculator.translation(integerList) = " + controllerNewVersion.translation(integerList));
        System.out.println("calculator.translation(doubleList) = " + controllerNewVersion.translation(doubleList));
        System.out.println("calculator.translation(floatList) = " + controllerNewVersion.translation(floatList));
        System.out.println("calculator.translation(stringList) = " + controllerNewVersion.translation(stringList));
    }
}
