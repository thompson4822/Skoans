import java.util.Date
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/** Created on 7/26/11 at 5:22 AM by Steve */
 
class IntroToTraits extends IntroSpec {

  // A location in two dimensional space
  class Point(val x: Int, val y: Int)

  trait Rectangular {
    // Behavior to go here...
  }

  class Rectangle(topLeft: Point, bottomRight: Point) extends Rectangular {
    def perimeter: Int = throw new NotImplementedException
    def area: Int = throw new NotImplementedException
  }

  test("Traits can have behavior") {
    /*
      Earlier we reviewed the use of traits as interfaces.  One of the best things about traits
      though is that they share all the best things from both Java interfaces and abstract
      classes in that they can have behavior and a class can inherit from multiple traits!

      For fun we'll fill out the Rectangular trait above.  Give it two abstract methods called
      topLeft and bottomRight, both of type Point.  Now provide it with methods for calculating,
      based on those two Points, its width and the height.  Any shape that needs to be rectangular
      can mix in this trait, as well as any others that might make sense
     */

    pending
  }

  test("A class can inherit from multiple traits") {
    /*
      A class may be mixed with multiple traits, each with their own behaviors.
     */
    pending
  }

}