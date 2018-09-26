package generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Generator {
    private double rangeMin = 0;
    private double rangeMax = 300;

    public HashMap<String, List<Double>> pointGenerator(int points) {
        HashMap<String, List<Double>> pointsHashMap = new HashMap<String, List<Double>>();
        for (int i = 0; i < points; i++) {
            pointsHashMap.put("point" + i, this.pointCoordinateGenerator());
        }

        return pointsHashMap;
    }


    private List<Double> pointCoordinateGenerator() {
        List<Double> pointCoordinate = new ArrayList<Double>();
        Random r = new Random();
        double randomValue;
        for (int i = 0; i < 2; i++) {
            randomValue = this.rangeMin + (this.rangeMax - this.rangeMin) * r.nextDouble();
            pointCoordinate.add(randomValue);
        }
        return pointCoordinate;
    }
}
