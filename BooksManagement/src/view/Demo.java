package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
//        Date date = new Date();
//        System.out.println(simpleDateFormat.format(date));
        String s = "Bùi Tất Trung";
        String[] ss = s.split("\\s+");
        System.out.println(ss[ss.length - 1]);
    }
}
