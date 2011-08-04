import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/** Created on 7/26/11 at 5:22 AM by Steve */
 
class IntroToObjects extends IntroSpec  {

  object DirtSimpleObject

  test("Objects are like singletons in Java") {
    /*
      Owing to the popularity of Design Patterns and global variables, the Singleton
      pattern is very popular in Java.  Unfortunately, it is also difficult to get
      right when threading is involved.

      Scala has a similar concept called 'object' as shown above.  Objects are similar
      to classes or traits in their expression, though they do have limitations.
     */
    pending
  }

  /*
    Widget class goes here

    WidgetFactory object goes here
   */

  test("Objects take no parameters") {
    /*
      Objects, like traits, cannot take any parameters.  Like objects however they
      can have vars, and therefore could hold state.  Create a class called Widget
      and an object called WidgetFactory that can create new widgets.  Add a variable
      to the factory that keeps track of the number of widgets created and write a
      test to ensure that this is incremented every time a new Widget is born.
     */
    pending
  }

  test("Objects may be composed of traits") {
    /*
      Just like classes, objects can inherit from traits
     */
    pending
  }

  test("Objects may inherit from a class") {
    /*
      Objects can also inherit from classes
     */
    pending
  }

  class Rocket {
    import Rocket.fuel
    private def canGoHomeAgain = fuel > 20
  }

  object Rocket {
    private def fuel = 10
    def chooseStrategy(rocket: Rocket) {
      if (rocket.canGoHomeAgain)
        goHome()
      else
        pickAStar()
    }

    def goHome() {}
    def pickAStar() {}
  }

  test("Companion objects can be used for static methods") {
    /*
      There is no static keyword in Scala.  All methods in a class or trait are
      instance methods, and all methods in an object behave as static methods
      do in languages like C# and Java.

      In order to give the programmer the same convenience as these languages,
      Scala has an interesting convention known as companion objects.  That is,
      an object exists with the same name as a class.  This is shown above for
      class Rocket.

      Write a test to ensure that this functions in the manner you expect.
     */
    pending
  }

}