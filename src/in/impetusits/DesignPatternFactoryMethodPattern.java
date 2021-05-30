package in.impetusits;

import com.sun.jdi.ClassNotPreparedException;
import java.util.Scanner;

/**
 *
 * @author Hrishikesh Pisal
 */
public class DesignPatternFactoryMethodPattern {

    public static void main(String[] args) {
        Computer comp;
        String computerType;

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("What type of computer do you want ?");
            System.out.print("Type '1' for office or \n"
                    + "Type '2' for Gaming Computer  \n"
                    + "Type '3' for Developers Computer : ");
            if (input.hasNextInt()) {

                int choice = input.nextInt();
                try {
                    comp = Computer.getComputer(choice);
                    System.out.println("Got :" + comp);
//                    System.out.println("Memory : " + comp.getMemory());
//                    System.out.println("HDD : " + comp.getHardDisk());
                    break;
                } catch (ClassNotPreparedException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Incorrect Choice entered");
                input.nextLine();
            }
        }

    }

}
