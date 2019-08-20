
import java.util.stream.Stream;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static final List<String> friends = 
    Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
  
  public static void pickName( final List<String> names, final String startingLetter) {
      final Optional<String> foundName =
            names.stream() 
                 .filter(name ->name.startsWith(startingLetter)) 
                 .findFirst();
      System.out.println(String.format("A name starting with %s: %s",
                         startingLetter, foundName.orElse("No name found")));
    }

  public static void main(final String[] args) {
    pickName(friends,"S");
         System.out.println(" ");
  }
}
