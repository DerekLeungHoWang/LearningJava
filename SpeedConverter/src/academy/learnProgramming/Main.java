package academy.learnProgramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static class SpeedConverter {

            public static  long toMilesPerHour(double kilometersPerHour){
                if(kilometersPerHour < 0){
                    return  -1;
                }
                return Math.round(kilometersPerHour/ 1.609);
            }

    }
}
