import java.time.LocalDateTime;

public class Test {

    public static void main(String[] args) {
        final TimeConverter timeConverter = new TimeConverterImpl();
        LocalDateTime localDateTime = LocalDateTime.now();
        //String isoTime = timeConverter.toIsoTime(localDateTime);
        LocalDateTime localTime = LocalDateTime.of(2020, 2, 19, 13, 38, 14, 306000000);
        System.out.println("****");
        System.out.println("*toLocalDateTime*");
        System.out.println(timeConverter.toLocalDateTime("2020-02-19T13:38:14.306Z"));
        System.out.println(localTime);
        System.out.println("****");
        System.out.println("*toIsoTime*");
        System.out.println(timeConverter.toIsoTime(localTime));
        System.out.println(localTime);
        System.out.println("*toISO:");
        System.out.println(timeConverter.toIsoTime(localTime));
        System.out.println(localTime);
        //OffsetDateTime time = OffsetDateTime.now();
        /*System.out.println(isoTime);
        System.out.println("****");
        LocalDateTime toLDT = timeConverter.toLocalDateTime(isoTime);
        System.out.println(toLDT);
        System.out.println("****");*/


    }

}
