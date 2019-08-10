/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package fpij;

import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.BiFunction;

public class Memoizer {
  public static <T, R> R callMemoized(
    final BiFunction<Function<T,R>, T, R> function, final T input) {
    Function<T, R> memoized = new Function<T, R>() {
      private final Map<T, R> store = new HashMap<>();
      public R apply(final T input) {
        return store.computeIfAbsent(input, key -> function.apply(this, key));
      }
    };
    return memoized.apply(input);
  }
}
