import collection.Seq
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/** Created on 7/26/11 at 6:43 AM by Steve */
 
class IntroToTuples extends IntroSpec {
  test("Tuples can have multiple elements of the same type") {
    /*
     A tuple is basically a poor man's structure.  It can hold an arbitrary number of items, where each
     item might be the same as or different from the type of any other item in the tuple.

     In Scala, tuples are denoted using parenthesis.  Such a tuple might be (1, 2) for example
     */
    val x = ("the old man", "pigs in a poke")
    x._1 should be("the old man")
    x._2 should be("pigs in a poke")
    pending
  }

  test("Tuples can have multiple elements of different types") {
    /*
      As mentioned, tuples can hold various types of things.  Using what was shown in the last
      test, write a test to ensure that this is the case.
     */
    pending
  }

  def getCityAndPopulationString(tuple: (String, Long)): String = throw new NotImplementedException

  test("Tuples can be passed to a method") {
    /*
      If you need to pass a tuple to a method (a practice you should usually refrain from unless
      dealing with a map) it is easy to do, as shown in the method above.  Modify this method to create
      the string "The city of 'Dead End Pass' has a current populace of 2052" when given the tuple
      ("Dead End Pass", 2052).  Test that it works
     */
    pending
  }

  def createCityAndPopulation(): (String, Long) = throw new NotImplementedException

  test("Tuples can be returned from a method") {
    /*
      One of the ways in which you can return multiple items from a method is via an object, but another
      is in using a tuple.  Again, this is pretty easy to do.  Go ahead and hard code something into the
      createCityAndPopulation above.  Test it out.
     */
    pending
  }

  test("Tuples can be decomposed (ugly way)") {
    /*
      We've already seen that tuples can be decomposed by refering to their first element (_1), second
      element (_2) and so on.  While this works, it doesn't contribute to code legibility.
     */
    pending
  }

  test("Tuples can be decomposed (clean way)") {
    /*
      A better way to decompose tuples is to assign them to human readable values using tuple notation.
      For instance, instead of writing this:

      val nameTuple = ("Cynthia", "Leonard")
      ...
      ...
      println("First Name = " + nameTuple._1 + ", Last Name = " + nameTuple._2)

      you could instead write:

      val nameTuple = ("Cynthia", "Leonard")
      ...
      ...
      val (firstName, lastName) = nameTuple
      println("First Name = " + firstName + ", Last Name = " + lastName)

      Go ahead and change some of the tuple tests above to incorporate this approach.
      All tests should still pass.
     */
    pending
  }

/*
  def fizzBuzz(n: Int) {
    for(value <- 1 to n) {
      ??? match {
        case (0, 0) => println("FizzBuzz")
        case (0, _) => println("Fizz")
        case (_, 0) => println("Buzz")
        case _ => println(value)
      }
    }
  }
*/

  test("Tuples can be pattern matched") {
    /*
      A rather simple programming problem is FizzBuzz.  The rules are that, from 1 to
      some number n, each number is printed to the screen, unless
      1) the number is divisible by 3, in which case "Fizz" is printed
      2) the number is divisible by 5, in which case "Buzz" is printed
      3) the number is divisible by 3 AND 5, in which case "FizzBuzz" is printed

      A simple version is represented in the commented out method above.  Can you make it
      work by using the modulus operator (%) on value to form a tuple with two elements?
     */
    pending
  }

  def personWithAge(nameTuple: (String, String), age: Int): (String, String, Int) = throw new NotImplementedException

  test("Nothing can be added to a tuple") {
    /*
      Tuples are immutable objects that look somewhat like collections, but behave
      entirely like values.  As this is the case, a tuple cannot have values added to it
      like a list would for example.

      Given that this is the case, the only thing you could do to change the shape of a
      tuple is to create a new one with parts of the old.  Try it out by defining the
      personWithAge method above.  Test your work.
     */
    pending
  }

  test("Collections of tuples of different shapes can form some surprising types") {
    /*
      This might not seem obvious, but Scala permits sequences of different tuples to
      be composed together.  If you do this though, the result might not be what you
      are anticipating!

      Using IntelliJ, find out what the types of the following are by hovering over
      the value to which they are assigned and adding a type annotation to their
      definition.
     */
    val tuple1 = Seq(('alpha, 'omega), ('beta, 'theta))
    val tuple2 = Seq((1, 2), ('alpha, 'omega), (3.5, "Are you listening?"))
    val tuple3 = Seq((1, 2), ('alpha, 'omega, 'gamma), (3.5, "Are you listening?", 7.23, 1, 'cappa, 'a'))
    pending
  }
}