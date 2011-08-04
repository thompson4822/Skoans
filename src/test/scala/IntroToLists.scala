import sun.reflect.generics.reflectiveObjects.NotImplementedException

/** Created on 7/27/11 at 8:37 AM by Steve */
 
class IntroToLists extends IntroSpec {

  var emptyList = Nil

  var numbers = List(1, 2, 3)

  test("The empty list shorthand is Nil") {
    /*
      In Scala, lists can either contain something or not.  If a list is empty, it can be
      represented as Nil, as shown above.  It can also be declared as List()
     */
    pending
  }


  test("Lists can be prepended to using the :: operator"){
    /*
      In Scala, the List collection is one of the most common used, just as in other
      functional languages.

      Lists themselves are by default immutable structures - that is that adding or
      subtracting elements to/from them doesn't alter the list, but rather creates a new
      one.

      To create a new list of numbers in which a value is prepended, use the :: operator,
      as in the following test
     */
    numbers = 32 :: numbers
    numbers(0) should be(32)
    pending
  }

  test("Lists can be appended to using the ++ operator"){
    /*
      Lists can be appended to using the operator '++'.  Note however that unlike the
      prepend operation, the append operation can be quite expensive due to the way in
      which Lists are structured.  Always use these sparingly.

      Append a value to numbers.  Test that the last value in the list is what you'd
      expect.
     */
    pending
  }


  test("Lists can be appended to one another with the ::: operator"){
    /*
      If you have two lists, you can append/prepend them using :::

      Using what you can observe from the way numbers is declared, create a new list of
      numbers called 'newNumbers' and prepend it onto the numbers list.  Test that your
      code works as expected.
     */

    pending
  }

  test("The first element of a list can be found using 'head'") {
    /*
      Lists are simplistic in the sense that they have a head and they have a tail.  The
      head is the first element, the tail is everything else.  This is how it all breaks
      down in memory for a list with three items:

      (item1 :: List(item2 :: List(item3 :: Nil)))

      Before we used indexing to access items in the list.  Test that getting the head of
      numbers returns what you'd expect.
     */
    pending
  }

  def sumOfEvenNumbers(nums: List[Int]): Int = {
    // Add together and return all of the even numbers in the list given.
    throw new NotImplementedException
  }

  test("List can be traversed using just head and tail") {
    /*
      Using what you know of looping, complete the method above.  The method should
      traverse the list only by using the head and tail methods.  As a clue, keep in mind
      that lists can be compared against Nil to find out if they are empty.

      Be sure to write a test that confirms that this method behaves as expected.
     */
  }

}