import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*

fun Date.toLocalDate(): LocalDate = toInstant().atZone(ZoneId.systemDefault()).toLocalDate()

fun Date.toLocalDateTime(): LocalDateTime = toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()

fun LocalDate.toDate(): Date = Date.from(atStartOfDay().atZone(ZoneId.systemDefault()).toInstant())