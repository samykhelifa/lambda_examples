import java.util.*;

public class TraditionalSearch {

   public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();  // list of animals
         animals.add(new Animal("fish", false, true));
         animals.add(new Animal("kangaroo", true, false));
         animals.add(new Animal("rabbit", true, false));
         animals.add(new Animal("turtle", false, true));
       //  print(animals, new CheckIfHopper());      // pass class that does check
         print(animals, a -> a.canSwim());   
 }

   private static void print(List<Animal> animals, CheckTrait c) {
      for (Animal animal : animals) {
          if (c.test(animal))               // the general check
              System.out.print(animal + " ");
              }
          System.out.println();
     }

 }
