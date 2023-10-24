package H_Date;


import java.text.SimpleDateFormat;
import java.util.Date;

public class H_Date {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyy");
        System.out.println(simpleDate.format(date));

    }
}
