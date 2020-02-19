import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConverterImpl implements TimeConverter {
    private DateTimeFormatter formatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;

    @Override
    public LocalDateTime toLocalDateTime(String isoTime) {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(isoTime, formatter);
        return zonedDateTime.toLocalDateTime();
    }

    @Override
    public String toIsoTime(LocalDateTime localDateTime) {
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneOffset.UTC);
        //return zonedDateTime.format(formatter);
        return DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(zonedDateTime);
    }
}
