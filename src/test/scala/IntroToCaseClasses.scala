import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/** Created on 7/26/11 at 5:24 AM by Steve */
 
class IntroToCaseClasses extends IntroSpec {

  case class Gear(diameter: Int, numberOfTeeth: Int)

  test("Case classes don't require 'new'") {
    /*
      Unlike classes, case classes can be created without the keyword 'new'.  Go
      ahead and assign a gear to a value without using new.
     */
    pending
  }

  test("Constructor parameters are public val by default") {
    /*
      Unlike regular classes, case classes don't treat their parameters as private final
      by default, but rather as public final (or in the case of regular classes, as vals)

      Build a Gear and test that its diameter is what you had set.
     */
    pending
  }

  test("Case class parameters can be made var (avoid if possible)") {
    /*
      The case class can be thought of as a value object from a DDD perspective.  It is
      a representation of something that will not change with time.  For instance, the
      gear above will not have a different diameter in the future, nor will it have a
      different number of teeth.

      There are many examples of value types all around us, such as the concept of an Address.
      While you might not always be at a certain address, an address is intrinsically the same.

      If you really must give a case class mutable state, you can do so by decorating one of
      its parameters with the 'var' keyword.  Try doing so now for the numberOfTeeth and
      test to make sure this can be altered after the gear is created.
     */
    pending
  }

  test("Case classes have a default toString implementation") {
    /*
      Though Gear is small, it does have some functionality that is not immediately apparent.
      Try printing it out.  You'll find that since it is a case class, it supplies a reasonable
      default for this functionality.
     */
    pending
  }

  test("Case classes automatically receive equals and hashCode methods") {
    /*
      Another nice bit of functionality that case classes get for free is 'equals' and
      hashcode.  Try creating three gears - two with the same parameters and one that is
      very different.  Write tests to verify that these instances are equal/not equal
      (in Scala, this is done with the '==' or '!=' operators respectively)
     */
    pending
  }

  case object Red

  test("Case classes that don't have parameters can be declared as a case object") {
    /*
      A handy way of defining a case class with no parameters is as a case object, as in the
      example of Red above.  In light of the fact that objects in Scala are singletons, this
      makes sense - there really should only be one definition of this type.
     */
    pending
  }
}