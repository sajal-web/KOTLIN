package Assignment1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit


/* This function takes one String dates of a specific format (yyyy-mm-dd) and return the day difference from today's date   */
fun String.getDaysDiff(): Long {
    // today's date
    // val formatter = DateTimeFormatter.ISO_DATE
    // got the manufacture date successfully
    // val manufactureDate = LocalDate.parse(manuDate, formatter)
    // return ChronoUnit.DAYS.between(LocalDate.parse(manuDate, DateTimeFormatter.ISO_DATE), LocalDate.now())

    //    val formatter = DateTimeFormatter.ISO_DATE
    //    val date1 = LocalDate.now()
    //    val date2 = LocalDate.parse(this,formatter)
    //    return ChronoUnit.DAYS.between(date2,date1)

    // reduce the code

    return ChronoUnit.DAYS.between(LocalDate.parse(this, DateTimeFormatter.ISO_DATE), LocalDate.now())

}