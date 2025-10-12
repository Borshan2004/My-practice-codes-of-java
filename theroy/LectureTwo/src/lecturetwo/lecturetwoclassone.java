package lecturetwo;

public class lecturetwoclassone {

    public static void main(String[] args) {
        long totalMilliSeconds = System.currentTimeMillis();

        long totalsecond = totalMilliSeconds / 1000;

        long currentsecond = (totalsecond % 60);

        long totalminitue = totalsecond / 60;

        long currentminitue = (totalminitue % 60);

        long totalhour = totalminitue / 60;

        long currenthour = (totalhour % 24);
        
        System.out.print("Time:"+currenthour+":"+currentminitue+":"+currentsecond);

    }

}
