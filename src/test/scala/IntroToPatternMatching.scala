import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/** Created on 7/26/11 at 5:46 AM by Steve */
 
class IntroToPatternMatching extends IntroSpec {

  def asString(value: Int) = value match {
    case _ => "I'm not sure I know what that is"
  }

  test("A pattern match is at its most basic the same as a Java switch case") {
    /*
      In many languages there is something akin to a switch/case statement.  This is
      true as well in Scala.  The basic way this is written is as shown:

        [expression] match {
          case [expression] [optional guard] => [action]
          case [expression] [optional guard] => [action]
          ...
        }

      Like other languages, Scala provides a catch all matcher through the use of '_', which from
      our discussion of imports can be read as meaning 'whatever it is'.

      The method 'asString' above takes a value and returns a string.  Right now it doesn't
      matter what you pass it, it will always return the same string.  Give it some different
      cases before the default and test that at least one of them work.
     */
    pending
  }

  class First { def display(text: String): Unit = {} }
  class Second { def show(text: String): Unit = {} }
  class Third { def scrawl(text: String): Unit = {} }

  def justPrintIt(text: String, printClass: Any) = printClass match {
    case f: First => f.display(text)
    case _ => fail("I don't know how to print with that class!")
  }

  test("Pattern matching can be done on types") {
    /*
      Pretend for a minute that the three classes above - First, Second, and Third -
      represent classes whose interface we cannot change.  Each has a method for basically
      doing some sort of display, but those methods all have different names.

      What we'd really like to do is have some text displayed by one of these classes.  In
      Java if we were in a situation like this, we might test to see if an object were an
      instanceOf some class, then cast it, then call the method we were interested in.

      Case classes provide us with a simpler mechanism, as justPrintIt shows.  Fill in the
      rest of the possibilities for classes Second and Third and observe that this works.
     */
    pending
  }


/*

  test("Pattern matching can be done on lists") {
    /*
      Pattern matching and lists are a natural fit!
     */
    pending
  }

  test("Pattern matching can be done on case classes") {
    /*

     */
    pending
  }

  test("Pattern matching can include guards") {
    /*

     */
    pending
  }

  test("Pattern matching can be made exhaustive (sealed)") {
    /*

     */
    pending
  }
*/

}