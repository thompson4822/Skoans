import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/** Created on 7/26/11 at 6:06 AM by Steve */
 
class IntroToEnums extends IntroSpec {

  object Color extends Enumeration {
    val Red, Green, Blue = Value
  }

  test("Enumerations can be defined without explicit values") {
    /*
      A basic enumeration can be declared in Scala as shown above.  Try your hand at creating
      one for the days of the week.
     */

    /*
      Here is how we might validate that the enumeration returns to us the string
      value we expect:
     */
    Color.Red.toString should be("Red")
  }

  test("Enumerations can be defined with explicit values") {
    /*
      In many cases, it is desirable to define the values of members in an enumeration.  To
      do this though we have to get more verbose.  Change the first line in Color to the
      following:

      val Red = Value(2)

      all the subsequent enumerated values should progress from there.  Here is how we can
      check this out:
     */
    //Color.Red.id should be(2)

    /*
      Alter the color Green to have a specific value.  Test that Blue has the subsequent value.
     */

    pending
  }

  object Wood extends Enumeration {
      val IndianRosewood = Value(0, "Indian Rosewood")
      val BrazilianRosewood, Mahogany, Maple, Cocobolo, Cedar, Adirondack, Alder, Sitka = Value
  }


  test("Enumerations can be defined with text") {
    /*
      It is often desirable to associate a friendly name with an enumerated value, as in the example above.
      Write a test to show that this works correctly.
     */
    pending
  }

}