public class Lab03100
{
    public static void main (String args []) {
        int startingValue = 10000123;
        int Hours = startingValue / 3600000;
        int mili = startingValue % 3600000;
        int Minutes = mili / 60000;
        mili %= 60000;
        int Seconds = mili/1000;
        int MilliSeconds= startingValue/1000;




        System.out.println("Starting milli-seconds:  " + startingValue);
        System.out.println("Hours:                   " + Hours);
        System.out.println("Minutes:                 " + Minutes);
        System.out.println("Seconds:                 " + Seconds);
        System.out.println ("Milli Seconds:          " + MilliSeconds);

    }

}
