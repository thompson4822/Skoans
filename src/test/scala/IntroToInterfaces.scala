import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/** Created on 7/26/11 at 5:22 AM by Steve */
 
class IntroToInterfaces extends IntroSpec {

  // Logger trait goes here ...

  test("In Scala, an interface can be defined using a trait") {
    /*
      There is no interface keyword in Scala.  Instead, the trait concept can
      be used for this purpose instead.  We'll see that traits can be used for
      much more later, but for now we want to be able to make sure we can
      express code in Scala that is beholden to good OO practices.

      To write a trait, simply use the 'trait' keyword instead of the 'class'
      keyword.  Give this a try now by creating a trait called Logger.
     */
    pending
  }

  test("A method with no body is abstract") {
    /*
      By now, we're pretty well versed in writing methods

      To create a method in an interface, we merely leave off the '= [body part]'.  With
      this in mind, add a method to the Logger trait called log that takes a message
      string as an argument and doesn't return anything.
     */

    pending
  }

  test("A value with no body is abstract") {
    /*
      Values can be added to Scala using the keyword 'val'.  If a val is not assigned
      anything, it is considered abstract.  Go ahead and add an abstract val of type
      String called prefix
     */
    pending
  }

  // Subclass with Displayable goes here ...

  test("An abstract method can later be redefined as a value") {
    /*
      In its support of the Uniform Access Principle, Scala allows abstract methods
      that do not have any parameters to be redefined as values in a subclass.  Go
      ahead and create a concrete subclass that extends Logger and declares
      log as a value.  Write a test for this below
     */
    pending
  }

  test("An abstract value cannot be later redefined as a method") {
    /*
      Unlike abstract methods, abstract values cannot be later redefined as anything
      other than values.  Add a definition for the prefix string to the subclass
      above and make sure that it produces the right result.
     */
    pending
  }

}