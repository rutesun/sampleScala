package Java_Scala_with_maven

import java.util.Calendar
import java.text.SimpleDateFormat

/**
 * @author rutes_000
 */
object DateUtils {
  def getNow(): String = {
    val today = Calendar.getInstance().getTime()
    val format = new SimpleDateFormat("yyyy-MM-dd")
    format.format(today)    
  }
}