import generator.Generator;
import object.triangle.Triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int countOfobjects =10;
        Generator generator = new Generator();
//        Оставил для проверки поиска максимального числа
        try {
            List<Double> triangleSquers = new ArrayList<Double>();
            List<Triangle> triangles = new ArrayList<Triangle>();
            for(int i = 0; i<countOfobjects; i++){
                Triangle triangleObject = new Triangle(generator.pointGenerator(3));
                triangles.add(triangleObject);
            }
            double max = Double.MIN_VALUE;
            int numberOfMaxSquare = 0;

            for (int i = 0; i <triangles.size(); i++){
//            Оставил для проверки поиска максимального числа
                triangleSquers.add(triangles.get(i).square());
                if(triangles.get(i).square() > max){
                    max = triangles.get(i).square();
                    numberOfMaxSquare = i;
                }
            }
            //        Оставил для проверки поиска максимального числа
            System.out.println(max);
            System.out.println(numberOfMaxSquare);
            System.out.println("Максимальная площадь триугольника " + Collections.max(triangleSquers));
            Triangle maxSquareTrianle = triangles.get(numberOfMaxSquare);

        } catch (Exception NullPointerException){
            System.out.println("Перепроверить кол-тво передаваеміх точек");
        }




    }
}
