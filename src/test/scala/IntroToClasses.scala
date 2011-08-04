import java.util.Date
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/** Created on 7/26/11 at 4:50 AM by Steve */

/*
A class is, as in Java, one of the fundamental building blocks in the Scala language.  There are some fundamental aspects to classes that
make them different than what you may be used to ...
 */

class IntroToClasses extends IntroSpec {

  class BasicPerson

  test("Basic class can be declared simply") {
    /*
      Note the class Person above.  It doesn't do anything, as yet, but it is all that we need to start building people:
     */
    val bob = new BasicPerson
    bob should not be(null)

    /*
      Notice that since BasicPerson didn't have any parameters, it wasn't necessary to add parenthesis when creating
      a new instance
     */
  }

  class Person(firstName: String, lastName: String, age: Int)

  test("Constructors are part of a class's signature") {
    /*
      In the above Person class, a person can be constructed using the parameters firstName, lastName, and dateOfBirth.
      We instantiate it just as we'd do in Java
     */
    val bob = new Person("Bob", "Sanderson", 35)
    bob should not be(null)

    /*
      Try creating an instance for yourself
     */

    // val me = ???
    // me should not be(null)
    pending
  }

  test("By default, constructor parameters are private finals") {
    /*
      Our person class can take in information, but it doesn't make anything public as yet.  If you
      try to access the firstName or lastName for example, the compiler will give you grief
     */
    val bob = new Person("Bob", "Sanderson", 35)

    // bob.firstName should be("Bob")
    pending
  }

  test("By annotating a constructor parameter with 'val', that parameter becomes a public final member") {
    /*
      Go ahead and modify the Person class.  Put the keyword 'val' (short for value)
      before the 'firstName: String'.  Then try to create bob and test that his firstName
      is what you expect.
     */


      /*
        Try changing bob's firstName to 'Robert'.  Since firstName is a val, we can get it, but we
        cannot set it after construction
       */

    pending
  }

  test("By annotating a constructor parameter with a 'var', that parameter becomes a public mutable member"){
    /*
      If we want to be able to modify the firstName of an instance after we've created it, we have to
      use the keyword var (short for variable).  Go ahead and make firstName a var and test that you
      can alter it after construction
     */

    pending
  }

  class Authorization(val userName: String, val password: String) {
    def this(userName: String) = { this(userName, "pa$$w0rd") }
  }


  test("A class can have multiple constructors"){
    /*
      Just like in Java, a class can have multiple constructors.  There is however a catch - all of the
      constructors have to call the constructor in the signature.

      The above class Authorization is a simple example.  Note how it includes a single method called 'this'
      which takes a userName parameter and calls itself with the userName and a default to satisfy the password field

      Go ahead and add another constructor that would allow an Authorization to be created with no parameters at all.
      Write a test to ensure that it is not null, and that its userName and password values are what you would
      expect.
     */
    pending
  }

  test("Multiple constructors can be avoided by taking advantage of default parameters in constructors") {
    /*
      Like many other languages, including Java at some point in the future :) Scala has the notion of
      default parameters.  For instance, we could change the signature of the person class such that age, if
      not defined, would always be a certain value, like so:

      class Person(var firstName: String, var lastName: String, var age: Int = 35)

      With this in place, the person could be created with only the firstName and lastName.

      Keeping this in mind, modify the Authorization class such that the multiple constructors are no longer needed.
      Make sure none of the other tests are failing.
     */

    pending
  }

  test("The body of the class itself is in a sense one big constructor") {
    /*
      Somewhat surprisingly, the entire body of a class is treated like a constructor.  This means that there can be
      expressions that aren't associated with any particular method.

      Try adding this line to the person class:

      println("Hello there " + firstName)
     */

    pending
  }
}