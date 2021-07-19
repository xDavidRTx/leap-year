import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class YearToolsSpec extends AnyFlatSpec with Matchers {
  "2004" must "be a leap year" in {
    YearTools.isLeapYear(2004) should be("is")
  }

  "2021" must "not be a leap year" in {
    YearTools.isLeapYear(2021) should be("is not")
  }

  "4 BC" must "be a leap year" in {
    YearTools.isLeapYear(-4) should be("is")
  }

  "101 BC" must "be a leap year" in {
    YearTools.isLeapYear(-101) should be("is not")
  }
}
