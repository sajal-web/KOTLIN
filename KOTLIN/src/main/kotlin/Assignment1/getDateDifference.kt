package Assignment1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun getDaysDiff(manuDate: String): Long {
    // today's date
    // val formatter = DateTimeFormatter.ISO_DATE
    // got the manufacture date successfully
    // val manufactureDate = LocalDate.parse(manuDate, formatter)
    return ChronoUnit.DAYS.between(LocalDate.parse(manuDate, DateTimeFormatter.ISO_DATE), LocalDate.now())

}