object YearTools {
  def isLeapYear(year: Int): String = {
    if (year % 4 equals 0) {
      "is"
    } else {
      "is not"
    }
  }
}
