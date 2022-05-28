package Chapter13;

import java.awt.*;

public class SortRectangles {
    public static void main(String[] args){
        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3, 5),
                new ComparableRectangle(13, 55),
                new ComparableRectangle(7, 35),
                new ComparableRectangle(1, 25)};
        java.util.Arrays.sort(rectangles);
        for (Rectangle rectangle: rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }

    }
}