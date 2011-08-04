import java.util.Date

/** Created on 7/26/11 at 5:53 AM by Steve */
 
class IntroToImports extends IntroSpec {

  class Product {
    val expiration = new Date
  }

  test("A single dependency can be imported in the same way as Java") {
    /*
      In the class Product above, we have a value expiration of type Date.  Note
      how this is resolved at the top of this file in a traditional import statement.
     */
    pending
  }

  test("Multiple dependencies from the same package can be imported together using {}") {
    /*
      Let's say that we needed two dependencies from class util - Date and List.
      In Java we might define two imports.  In Scala though we have another option -
      we can use a single statement with the classes that we're interested in inside
      curly braces, like so:

      import java.util.{Date, List}

      Try modifying the import to include several files from java.util.  If you don't
      remember what some of these are off the top of your head, just start typing things out
      and let IntelliJ help.
     */
    pending
  }

  test("A dependency can be renamed upon import using {=>}") {
    /*
      In addition to selectively importing, you can also change the names of the classes in
      order to better manage scalability.  An example of where this might be useful is when
      dealing with Scala and Java collections in the same code.  For instance, here is how
      we could make a Java List distinct from a Scala List:

      import java.util.{List => JList}
     */
    pending
  }

  test("All classes in a particular package can be imported with _") {
    /*
      Like Java, there is a mechanism for importing all classes from a particular package.
      Instead of using the '*', Scala uses the underscore ('_').  This is a popular character
      in Scala that basically can be read as 'whatever it is'
     */
    pending
  }

  test("Imports may occur within a class") {
    /*
      To help manage scalability, imports can be defined at just about any scope, which is
      a bit strange perhaps to those new to the language.

      Move the import statement to the line just above class Product.  Test that the
      code still works.
     */

    /*
      Move the import inside the Product class itself.  Does the code still work?
     */
    pending
  }


}