import java.util.Iterator;
import java.util.Scanner;

public class application {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Stack
        System.out.println("----- Stack -----");
        Stack<String> stack = new Stack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.pop();
        stack.push("6");

        stack.printStack();

        System.out.println( "size = " + stack.getSize());
        for (Element el : stack){
            System.out.println(el);
        }
        System.out.println("");

        //Queue
        System.out.println("----- Queue -----");
        Queue<String> queue = new Queue<>();

        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        queue.enqueue("5");
        try{
            queue.dequeue();
        }catch (EmptyQueueException e){
            e.printStackTrace();
        }
        queue.enqueue("6");

        queue.printQueue();
        System.out.println("");


        // Claculate dublicate characters in string
        System.out.println("----- Claculate dublicate characters in string -----");
        System.out.println("Введите строку:");
        System.out.println(CalculateCharacters.calculateDublicateCharachters(scanner.next()));
        System.out.println("");

        // Intersection rectangles
        System.out.println("----- Intersection rectangles -----");
        System.out.println(intersectionRectangles(new Point(1, 2), new Point(2, 4), new Point(-1, 2), new Point(0, 3)));


    }



    private static boolean intersectionRectangles(Point p1, Point p2, Point p3, Point p4){
        return (((p1.getX() >= p3.getX()) && (p1.getX() <= p4.getX())) ||
               ((p2.getX() >= p3.getX()) && (p2.getX() <= p4.getX()))) &&
                (((p1.getY() >= p3.getY()) && (p1.getY() <= p4.getY())) ||
               ((p2.getY() >= p3.getY()) && (p2.getY() <= p4.getY())));
    }



}
