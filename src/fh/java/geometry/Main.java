package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) { //static: at startup there are no objects

            Main main = new Main();
            main.doIt();
        }

    private void doIt() {

        List<GeometricShape> shapeList = new ArrayList<>(); // Polymorphism
        // like Student xxx = new Steiner;

        fillList(shapeList);

        printList(shapeList);




    }


    public void fillList(List<GeometricShape> shapeList) {

        shapeList.add(new Circle(1,2,2.0));
        shapeList.add(new Circle(2,1,2.0));
        shapeList.add(new Circle(3,2,2.0));

        shapeList.add(new Rectangle(20,1,10.2,1.3));
        shapeList.add(new Rectangle(34,65,140.2,1.7));
        shapeList.add(new Rectangle(40,6,10.6,1.33));

        shapeList.add(new RightTriangle(6786,12,3.9,9.0));

    }


    public void printList(List<GeometricShape> shapeList) {
        

        System.out.println("for loop##########################################");
        for (int pos = 0; pos < shapeList.size(); pos++) {
            System.out.println(shapeList.get(pos));
        }
        System.out.println("for each##########################################");
        for (GeometricShape shape : shapeList) {
            System.out.println(shape);
        }
        System.out.println("stream 1##########################################");
        shapeList.stream().forEach(shape -> System.out.println(shape));
        System.out.println("stream 2##########################################");
        shapeList.stream().forEach(System.out::println);
    }

}
