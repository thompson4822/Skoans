import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/** Created on 7/26/11 at 6:48 AM by Steve */

class IntroToAbstractClasses extends IntroSpec {

  test("Abstract classes are declared in the same way as in Java") {
    /*
      Like many OO languages, Scala provides the ability to define abstract classes by using the
      keyword abstract.  An abstract class, like a regular class, can have a constructor, but
      no instances can be directly created.

      Create an abstract class above this method called Monster.  The Monster will have abstract
      speed and attack values (both integers) and a damage method that calculates its result by
      multiplying speed and attack.

      Create a couple of subclasses of Monster, defining the speed and attack for each.  Test that
      the result is what you were expecting.
     */
    pending
  }

  test("Abstract classes can have a constructor") {
    /*
      Monsters might have a description.  Knowing this, add such a parameter to the constructor for
      Monster and have its subclasses call their parent with the appropriate value.
     */
    pending
  }

}