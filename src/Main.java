import models.result_generator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        result_generator re=new result_generator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Marks in Phys");
        re.setPhysics(sc.nextInt());
        System.out.println("Marks in math");
        re.setMaths(sc.nextInt());
        System.out.println("marks in chemistry");
        re.setChemistry(sc.nextInt());
        System.out.println("Maths: "+re.getMaths());
        System.out.println("Phys: "+re.getPhysics());
        System.out.println("Chemistry: "+ re.getChemistry());
    }
}