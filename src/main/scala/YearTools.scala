object YearTools {
  def isLeapYear(year: Int): String = if ( {
    Set(year % 4 == 0 && year % 100 != 0,
      year % 400 == 0 && year % 100 != 0)
      .exists(identity)
  }) {
    "is"
  } else {
    "is not"
  }
}
