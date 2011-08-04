/** Created on 7/26/11 at 5:08 AM by Steve */
import org.scalatest.Suite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class IntroductoryCourseSuite extends Suite {
  override def nestedSuites = List(
    new IntroToClasses,
    new IntroToMethods
//    new IntroToLists,
//    new IntroToCollectionMethods,
//    new IntroToInterfaces,
//    new IntroToEnums,
//    new IntroToImports,
//    new IntroToAbstractClasses,
//    new IntroToTraits,
//    new IntroToObjects,
//    new IntroToCaseClasses,
//    new IntroToPatternMatching,
//    new IntroToTuples,
//    new IntroToFunctions
  )
}