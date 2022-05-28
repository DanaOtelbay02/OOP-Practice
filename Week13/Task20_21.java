package Week13;

import java.util.Comparator;

public class Task20_21 {
    public static void main(String[] args){
        GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
                new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
                new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
                new Circle(6.5), new Rectangle(4, 5)};

        selectionSort(list, new Comparator<GeometricObject>() {
            @Override
            public int compare(GeometricObject o1, GeometricObject o2) {
                double a1 = o1.getArea();
                double a2 = o2.getArea();
                if (a1 > a2)
                    return 1;
                if (a1 == a2)
                    return 0;
                else
                    return -1;
            }
        });

        for (GeometricObject e: list) {
            System.out.printf("%.2f ", e.getArea());
        }

    }

    public static <E> void selectionSort(E[] list, Comparator<? super E> comparator){
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            E currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (comparator.compare(currentMin, list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}



