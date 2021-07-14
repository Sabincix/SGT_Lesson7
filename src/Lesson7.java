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

        String day = "casual Friday";

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


        // Switch conditions
        switch (day) {
            case "Working day":
                System.out.println("You should wear high heels");
                break;
            case "casual Friday":
                System.out.println("You can wear flats");
                break;
            case "Halloween":
                System.out.println("You can wear any costume");
                break;
            case "Holidays":
                System.out.println("You can stay at home");
                break;
            default:
                System.out.println("No such day");
        }

//          Intervals of ages

//        Calculate price for a ticket in museum
        // 0-7 Free
        // 8-12 1 eur
        // 13-18 2 eur
        // 18-64 5 eur
        // 65- 128 - free

        short age = 31;
        if ( ( age>= 0 && age < 8) || ( age >=64 && age < 120 ) ) {
            System.out.println("You can go for free");
        } else if( age >= 8 && age < 12 ) {
            System.out.println("Price is 1 euro");
        } else if( age >= 13 && age < 18 ) {
            System.out.println("Price is 2 euro");
        } else if( age >= 18 && age < 64 ) {
            System.out.println("Price is 5 euro");
        } else {
            System.out.println("Seems that your age is incorrect");
        }



    }
}
