import java.lang.Thread
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/** Created on 7/26/11 at 5:21 AM by Steve */
 
class IntroToMethods extends IntroSpec  {

  class Calculator {
    def sum(value1: Int, value2: Int): Int = throw new NotImplementedException

    protected def abs(value: Int): Int = math.abs(value)
  }

  test("General expression of a method") {
    /*
      Previously we saw how to write a method when creating multiple class constructors.  Here
      is the basic syntax:

      def [method name]([parameters]): [return type] = [body of method]

      In the simple class above, we've declared a method called 'sum' which will combine two
      integer values.  Go ahead and make it return the sum of the numbers, just as you would in
      Java, and write a test that ensures it gives you back the value you'd expect.
    */

    /*
      Just for practice, define methods for multiplying and subtracting two integer values.
     */

    pending
  }

  // ----------------------------------------------------
  // Method visibility
  // ----------------------------------------------------

  test("All methods are by default public") {
    /*
      Notice that in the code above, we didn't specify that the method was public.  This
      is because in Scala, everything is public unless declared otherwise.  There is no
      public keyword in the language
     */
    pending
  }

  class AbsoluteCalculator extends Calculator {
    def addAbsolute(value1: Int, value2: Int): Int = {
      return sum(abs(value1), abs(value2))
    }
  }

  test("Private or protected methods behave similarly to Java") {
    /*
      In Scala as in Java, protected and private visibility can be declared.

      To test this, define a method in Calculator called abs which returns the
      absolute value of any integer that you give it.  Instead of declaring this
      'def ...', use 'protected def ...'

      Now uncomment the class above.  Test that instances of Calculator cannot
      use the abs method, but that the AbsoluteCalculator does the right thing
      when given negative values.
     */
    val calc = new AbsoluteCalculator
    calc.addAbsolute(-2, 3) should be(5)
  }

  // ----------------------------------------------------
  // Method basics
  // ----------------------------------------------------

  test("Method parameters don't need val/var annotations") {
    /*
      Unlike class constructors, decorating method parameters with val/var
      doesn't really make much sense.  If you attempt to do this, the compiler
      will give you grief.
     */
    pending
  }

  test("Method parameters are always final/immutable") {
    /*
      In the Calculator, try adding a line that changes value1 before it performs its
      calculation.  This code will not compile because parameters are always final.

      The usual caveat applies though - if the parameter is an object, you can still
      manipulate it as long as you don't try to alter the parameter reference.
     */
    pending
  }

  test("Methods that override other methods must use the 'override' keyword") {
    /*
      In Java, there is the @Override annotation, and it is optional.  In Scala, if
      you want to override a method, you use the 'override' keyword before the 'def'
      keyword.  It is not optional.

      Override toString() in class Calculator.  Have it return whatever you want and
      test that calling this on an instance of this class produces the expected result.
     */
    pending
  }

  test("There is no void in Scala") {
    /*
      Scala doesn't have anything that exactly corresponds to void.  This is because every
      expression, no matter how simple, always needs to have a type.  To specify that the type
      of something is basically void, Scala has the type Unit.  To see this in action, you
      could add a method to Calculator like the following:

      def showSum(value1: Int, value2: Int): Unit = {
        println("The sum of the values is " + sum(value1, value2)
      }
     */
    pending
  }

  // ----------------------------------------------------
  // Conditionals and looping
  // ----------------------------------------------------

  class Movie(val title: String, val isNew: Boolean)

  class MovieRental() {
    def cost(movie: Movie):BigDecimal = {
      var totalCost:BigDecimal = 0
      if(movie.isNew)
        totalCost = 2.00;
      else
        totalCost = 1.00;
      return totalCost
    }
  }

  test("The Scala if/else statement is an expression") {
    /*
      Just like Java, Scala has the if/else conditional statement, as shown in the class above, where
      the cost for a movie rental is being calculated.  However, unlike Java, if/else is an expression
      that returns something.  The upshot of this is that the ternary operator from Java isn't needed
      or included in Scala because the if/else can do the same thing.

      There is nothing wrong with the cost function above, but seasoned ternary junkies will immediately
      recognize that it could be expressed as a single line.  Do this and ensure that the test still runs.
     */
    val movie = new Movie("Captain America", true)
    val rental = new MovieRental
    rental.cost(movie) should equal(2.00)
  }

  class Loopy {
    def forLoop(startValue: Int, endValue: Int): Int = {
      var result = 0
      for(x <- startValue to endValue)
        result += x
      return result
    }

  }

  test("Iterating in Scala with 'for' comprehensions (simple)") {
    /*
      Like most languages, Scala has a built in looping construct, represented by the for comprehension.
      This is a little more advanced and general purpose than the construct in languages like C/C++/Java.
      Here we will look at some successively complex versions of this mechanism.

      First, study the forLoop method in the class above and see if you can figure out what it is doing.
      If you need a hint, the '<-' operator should be read as 'in'.

      Once you feel you have a handle on it, try writing a test to see if you are correct.
     */
    pending
  }

  test("Iterating in Scala with 'for' comprehensions (collections)") {
    /*
      The last iteration code was fine for index based looping, but what about the
      refined beauty of a foreach mechanism?

      The for comprehension has you covered here as well.  We create a collection of strings below to
      iterate over.  Now its up to you to create a method in Loopy with the following signature

      def lengthOfStrings(strings: Seq[String]): Int = {

      This method should determine the total number of characters of all the strings passed to it.
      Write a test to ensure it works.
     */
//    val loops = new Loopy
//    val input = Seq("Along", "Came", "Mary")
//    loops.lengthOfStrings(input) should be(13)
    pending
  }

  test("Iterating in Scala with 'for' comprehensions (advanced)") {
    /*
      For comprehensions can get much more involved, but the last thing that we'll look at in
      this session is using conditionals.  For example, if we wanted to sum only the even numbers
      in the original forLoop method, we could change the 'for' to look like this:

      for(x <- startValue to endValue if(x % 2 == 0))
        result += x

      With this in mind, try creating a method in loopy that will take a sequence of strings,
      as in the last test, and count the number that have exactly four characters.  Verify this
      in a test.
     */
  }

  test("Methods can have varying numbers of the same parameter type") {
    /*
      As in Java, there is a syntax for denoting that a variable number of parameter arguments of
      a given type can be expected.  This can be done by appending a '*' to the parameter type, as in

      def widgetAssembler(widgets: Widget*)

      Within the widgetAssembler method, widgets is recognized as a Seq[Widget] (similar to what you
      saw when writing the lengthOfStrings method in Loopy)

      Using these insights, and with all that you now know about the for comprehension, return to the
      lowly MovieRental class and change the cost method to take a variable number of movies, for which
      it should calculate and return their total cost.

      As always, be sure to write some tests!
     */
    pending
  }

  // ----------------------------------------------------
  // Some things to understand about values
  // ----------------------------------------------------

  class ValueTester {
    var spyPassphrase: String = ""
    val whatTheSpySaid: String = {
      spyPassphrase = "The one-eyed hawk eats persimmons by the light of Antares"
      "I didn't say a word!"
    }

    lazy val sleeperAgent: Unit = Thread.sleep(1000)
  }

  test("Values can be associated with arbitrary functionality, but that functionality is only run once") {
    /*
      When declaring a value as part of a class, it has to be associated with a value, but can also
      run arbitrary behavior.  This behavior is only invoked once - accessing the field on subsequent
      occasions doesn't do anything other than return the value.

      Try this out with the ValueTester class above.  When you access the spyPassphrase the first time the
      class is instantiated, it should have rather interesting content (creating an instance of the class
      causes whatTheSpySaid to be invoked).  After that, if you alter spyPassphrase, then no matter how many
      times you request the value of whatTheSpySaid, the former will not be altered.
     */
//    val tester = new ValueTester
//    tester.spyPassphrase should be("The one-eyed hawk eats persimmons by the light of Antares")
//    tester.spyPassphrase = ""
//    tester.whatTheSpySaid should be("I didn't say a word!")
//    tester.spyPassphrase should be("")
    pending
  }

  test("The cost of lazy values is deferred until they are referenced") {
    /*
      Expensive data access retrieval in Java and C# is often deferred until the data is absolutely needed,
      for it might never be needed.  Here is a Java example:

      public String getDnaCluster() {
        if(dnaCluster == null)
          dnaCluster = researchLab.calculateDnaCluster();
        return dnaCluster;
      }

      In the above, note that sleeperAgent is a lazy value.  Its associated behavior will never be
      run until we decide to access it.

      With this in mind, change the val whatTheSpySaid to be lazy.  Make sure to test spyPassphrase
      both before and after the value is accessed for the first time.
     */
    pending
  }

  // ----------------------------------------------------
  // Making methods cleaner
  // ----------------------------------------------------

  test("Return is redundant") {
    /*
      In Scala, the return statement is unnecessary.  Every method is the evaluation of some
      expression, and the result of that evaluation is what we want to return.

      In future examples, we'll see less and less of this keyword.  Go ahead and remove it
      wherever it occurs above.  All tests should still pass.
     */
    pending
  }

  test("Make vars into vals") {
    /*
      The big difference between vars and vals is the concept of immutability.  While not really
      the subject of much interest in the mainstream OO world, immutability is all the rage in
      functional languages because of these benefits:

      1) Every mutable piece of state in a program is something that could potentially go wrong
         in the future, and this creates extra headache when testing
      2) Making code immutable has tangible benefits on concurrency - with no mutable state a
         piece of code is lends itself easily to this approach.

      You can't eliminate all mutable state, but whenever possible, use vals instead of vars.
      Even better yet, seek ways of eliminating the need for either.

      Go through the code above and where it makes sense, apply this.  All tests should still
      run.
     */
    pending
  }

  test("Type inference can be your friend") {
    /*
      Where it is obvious what a value's type is, there is no need to annotate its declaration.
      For instance:

      val name: String = "Shirley"

      reads better when expressed this way:

      val name = "Shirley"

      Additionally when 'name' is used, the normal expectation is that it would be a string and not a
      long, char, database connection or a dog kennel.

      As you write Scala code, you'll find that over time you begin to feel more comfortable without
      type annotations, just as in the C# world.  With a modern IDE, you can always inspect the types
      or have them generated for you.
     */
    pending
  }

  test("Adding all numbers between 1 and N (recursive)") {
    pending
  }

  test("Methods can have inner methods") {
    pending
  }


}