package object.triangle;

import maths.ISquare;

import java.util.HashMap;
import java.util.List;

/**
 * Не важно какого размера будет HashMap, главное чтоб больше 3
 */
public class Triangle implements ISquare {
    private HashMap<String, List<Double>> hashMapPoints;

    public Triangle(HashMap<String, List<Double>> hashMapPoints) {
        if(hashMapPoints.size() > 2){
            this.hashMapPoints = hashMapPoints;
        } else {
            System.out.println("Need more points");
        }

    }

    private Triangle setX1() {
        this.x1 = this.hashMapPoints.get("point0").get(0);
        return this;
    }

    private Triangle setY1() {
        this.y1 = this.hashMapPoints.get("point0").get(1);
        return this;
    }

    private Triangle setX2() {
        this.x2 = this.hashMapPoints.get("point1").get(0);
        return this;
    }

    private Triangle setY2() {
        this.y2 = this.hashMapPoints.get("point1").get(1);
        return this;
    }

    private Triangle setX3() {
        this.x3 = this.hashMapPoints.get("point2").get(0);
        return this;
    }

    private Triangle setY3() {
        this.y3 = this.hashMapPoints.get("point2").get(1);
        return this;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public double getX3() {
        return x3;
    }

    public double getY3() {
        return y3;
    }

    private double getX1() {
        return this.x1;
    }

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;


    public double square() {
        this.setX1().setY1().setX2().setY2().setX3().setY3();
        double a = Math.sqrt((this.getX1() - this.getX2()) * (this.getX1() - this.getX2()) + (this.getY1() - this.getY2()) * (this.getY1() - this.getY2()));
        double b = Math.sqrt((this.getX1() - this.getX3()) * (this.getX1() - this.getX3()) + (this.getY1() - this.getY3()) * (this.getY1() - this.getY3()));
        double c = Math.sqrt((this.getX2() - this.getX3()) * (this.getX2() - this.getX3()) + (this.getY2() - this.getY3()) * (this.getY2() - this.getY3()));
        double squareT = 0;
        if (a + b <= c || a + c <= b || a + c <= b)
            System.out.println("Wrong data!!! triangle is not exist");
        else {
            double p = (a + b + c) / 2.0;
            squareT = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return squareT;
    }
}
