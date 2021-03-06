package ru.job4j.loop;

/**
 * Протеиновая диета
 * В тренажерный зал пришли новые спортсмены - Макс и Ник.
 * Они хотят прогрессировать очень быстро и поэтому употребляют много протеина.
 * Макс за месяц увеличивает силу тяги в 3 раза за счет такой диеты, а Ник - в 2 раза.
 * Макс хочет узнать, сколько месяцев ему нужно тренироваться, чтобы обогнать Ника в тяге.
 *
 * @author John Ivanov (johnivo@mail.ru)
 * @since 16.07.2019
 */
public class Fitness {

    public int calc(int max, int nik) {
        int month = 0;
        while (max < nik) {
            max *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
