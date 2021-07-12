public class Lesson7 {

    public static void main(String[] args) {

//        short time = 8;
//        short day = 5;
//        short month = 11;
//        short year = 2021;
//
//        if (time > 16 && time < 24 && month == 12) {
//            System.out.println("Something in December");
//        }
//
//        System.out.println(day + "/" + month + "/" + year);
//



//        Alarm clock application

        // initialization
        String dayOfWeek = "Tuesday";

        if ( dayOfWeek == "Tuesday" || dayOfWeek == "Monday") {
            System.out.println("Alarm is set to 7 o'clock");
        } else if( dayOfWeek == "Wednesday") {
            System.out.println("Alarm is set to 8 o'clock ");
        } else if ( dayOfWeek == "Thursday" || dayOfWeek == "Friday") {
            System.out.println("Alarm is set to 7.30");
        } else if ( dayOfWeek == "Saturday" || dayOfWeek == "Sunday") {
            System.out.println("No alarm is set");
        }

//         If you go to office
//         working day - high heels
//         casual Fridays - you can wear flats
//         Holidays - you can stay at home
//         Halloween - you can wear any costume

//  Office attire

        String day = "Working day";

        if ( day == "Working day" ) {
            System.out.println("You should wear high heels");
        } else if ( day == "casual Friday") {
            System.out.println("You can wear flats");
        } else if ( day == "Holidays") {
            System.out.println("You can stay at home");
        } else if ( day == "Halloween") {
            System.out.println("You can wear any costume");
        } else {
            System.out.println("Such day does not exist");
        }

    }
}
