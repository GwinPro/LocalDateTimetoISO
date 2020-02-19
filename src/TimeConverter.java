import java.time.LocalDateTime;


public interface TimeConverter {
    LocalDateTime toLocalDateTime(String isoTime);
    String toIsoTime(LocalDateTime localDateTime);
}
