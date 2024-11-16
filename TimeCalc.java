public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd= Integer.parseInt(args[1]);
        int totalMinutes = ((hours*60) + minutes + minutesToAdd);
        int totalHours = totalMinutes / 60; 
        int newHour = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours*60);
        if (newMinutes - 10 < 0) {
            System.out.println(newHour + ":" + "0" + newMinutes);
        } 
        else { 
        System.out.println(newHour + ":" + newMinutes);
        }
        // System.out.println("hours: " + hours);
        // System.out.println("minutes: " + minutes);
        // System.out.println("minutes to add: " + minutesToAdd);
        // System.out.println("New hours: " + newHour);
        // System.out.println("New minutes: " + newMinutes);

    }
    
}
