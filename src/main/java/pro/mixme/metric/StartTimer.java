package pro.mixme.metric;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StartTimer {

    static Date timeStart;
    static SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm.ss");

    /*
     * Статический блок инициализации
     * Отработает первым при инициализации класса
     */
    static {
        timeStart = new Date();
        System.out.println("1 - Статический блок: \t time > " + dateFormat.format(timeStart));
    }

    public StartTimer() {
        System.out.println("3 - Конструктор: \t time > " + dateFormat.format(timeStart));
    }

    {
        System.out.println("2 - Блок инициализации  \t time > " + dateFormat.format(timeStart));
    }

}
