package Week13;

import java.io.File;
import java.util.*;

public class Task20_18 {
    public static void main(String[] args) {
        // Prompt the user to enter a directory or a file
        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        // Display the size
        System.out.println(getSize(new File(directory)) + " bytes");
    }

    /** Returns the size of a directory */
    public static long getSize(File file) {
        // Create a Queue
        Queue<File> queue = new LinkedList<>();
        long size = 0; // Accumulates the directory size

        addDirectory(queue, file);

        while (!queue.isEmpty()) {
            // Remove an item form the queue into t
            File t = queue.remove();
            if (t.isFile())
                size += t.length();
            else // Add all files and subdirectories under t into the queue
                addDirectory(queue, t);
        }

        return size;
    }

    /** Adds a Directory to the queue */
    private static void addDirectory(
            Queue<File> queue, File directory) {
        for (File file: directory.listFiles()) {
            queue.offer(file);
        };
    }
}
