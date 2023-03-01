import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.Month;
import java.util.*;

public class DateOfBirth {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full date of birth");
        String s1 = sc.nextLine();
        System.out.println(calculateBornDay(s1));

        LocalDate now = LocalDate.now();
        LocalDate l = LocalDate.of(2001,05,19);
        Period p = Period.between(l,now);
        System.out.println("Years = " + p.getYears());
        System.out.println("Months = " + p.getMonths());
        System.out.println("Days = " + p.getDays());

    }
        public static String calculateBornDay (String s1) throws ParseException {
            SimpleDateFormat a = new SimpleDateFormat("dd-mm-yyyy");
            SimpleDateFormat a1 = new SimpleDateFormat("EEEEE");
            Date d = a.parse(s1);
            String s = a1.format(d);
            return s.toUpperCase();
        }


}
