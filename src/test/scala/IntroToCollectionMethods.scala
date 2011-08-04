import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/** Created on 7/26/11 at 6:53 AM by Steve */
 
class IntroToCollectionMethods extends IntroSpec {

  /*
    In the earlier material on methods, it was shown that Scala has a for comprehension that
    can be used to loop.  While this is a useful construct, it is seldom used in Scala
    because collections have such a rich and varied family of methods to help you do what
    you need in a more expressive way, as we'll learn in the following:
   */

  class Movie(val title: String, val isNew: Boolean)

  def newMovies(movies: List[Movie]): List[Movie] = {
    var result: List[Movie] = Nil
    for(movie <- movies if(movie.isNew))
      result = movie :: result
    result
  }

  test("Collections can be filtered") {
    /*
      newMovies (shown above), essentially filters through a list of movies in the same way Java code
      might and returns those that are new.  Test this out by creating a list of movies, some of which are
      new, and ensuring that what is returned is what you expect.
     */

    /*
      As it happens, Scala Collections have a number of methods that can reduce such operations significantly.
      One of these methods is filter, and here is how it might be used to reduce a list of people to just those
      that are under the age of 18:

      people.filter(person => person.age < 18) // Create a list of only those persons under the age of 18

      With this in mind, try to rewrite the newMovies method.  The result should drop to a single line.  Your
      previous tests should still work.
     */
    pending
  }

  def newMovieNames(movies: List[Movie]): List[String] = {
    var result: List[String] = Nil
    for(movie <- movies if(movie.isNew))
      result = movie.title :: result
    result
  }

  test("Collections can be mapped/transformed") {
    /*
      A common thing to do when dealing with collections is to turn them from one thing to another.  In the
      newMovieNames method above, we turn a list of Movie objects into just the names of those that are new.
      The code could be greatly simplified by using another collection method called map.  Here is an
      example that gets the heights of all buildings given to it:

      buildings.map(building => building.height)

      Go ahead and simplify newMovieNames accordingly.  Keep in mind that it is filtering, which you could
      take care of in a number of ways:
      1) Use an if statement inside the map
      2) Call newMovies before hand
      3) Just include the filter before the map

      Use whatever approach reads best to you. Write some tests to make sure it works.
     */
    pending
  }

  test("Collections can be sorted") {
    /*
      So we've now got the ability to filter and transform.  It would be nice to sort as well.  We could
      use something involving comparators, but who keeps that sort of syntax in their head anyway?

      Scala offers the sortWith, and its really simple to use.  Basically it takes two elements and returns
      a boolean.  Here is how we might display a sorted list of all the first names of the people attending
      the dojo:

      awesomeFolk.map(person => person.firstName).sortWith(name1, name2 => name1 < name2)

      Try doing this for newMovieNames.  Test that it works.
     */
    pending
  }

  def cost(movies: Movie*):BigDecimal = {
    var totalCost:BigDecimal = 0
    for(movie <- movies) {
      if(movie.isNew)
        totalCost = 2.00;
      else
        totalCost = 1.00;
    }
    totalCost
  }

  test("Collections can be reduced") {
    /*
      When going through methods, we had a cost method quite similar to the one above.  By now you
      probably have some good ideas on how we might reduce this down to next to nothing using a
      transformation.  But even if we did that, we're still left with some collection (in this case
      BigDecimals) in the end.  How do we take that and create a total cost?

      Conveniently for just such quandries, some Scala collections are outfitted with a method called
      sum.  Here is an example of its use:

      List(1, 2, 3, 4, 5).sum     // produces the value 15

      With this, and everything else you've learned, rewrite cost.  Test that it does what you expect.
     */
    pending
  }
}