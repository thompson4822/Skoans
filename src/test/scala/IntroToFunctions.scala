import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/** Created on 7/26/11 at 6:51 AM by Steve */
 
class IntroToFunctions extends IntroSpec {

  val sum = (x: Int, y: Int) => x + y

  test("Values can be declared as anonymous functions") {
    /*
      As is shown in the simple method above, an anonymous function can be
      assigned to a value.  The syntax for these should look similar to what
      we saw earlier for collections, and indeed it is.

      Note that now you can use sum just like it was a method.
     */
    sum(1, 23) should be(24)
    pending
  }

  def performCalculation(x: Int, y: Int, func: (Int, Int) => Int) = func(x, y)

  test("Functions can be passed to methods") {
    /*
      Imagine that you had a method that needed to perform several sorts of
      operations on two integers.  You could take the approach that we
      showed earlier and write a Calculator class with a lot of very similar
      methods, or you could write a single method like the one above!

      Utilizing this method, call performCalculation to do addition, subtraction
      and multiplication.  Verify that it works, and model your anonymous methods
      after the structure of the sum value shown above.
     */
    pending
  }

  val addFive = (x: Int) => sum(5, x)

  test("Functions can be returned from methods") {
    /*
      Just as methods can take functions, they can also create and return them
      to the caller.  For instance, we could utilize the sum function to make a
      derivitive function called addFive, as shown above

      Test that this produces the results you would expect.
     */
    pending
  }
}