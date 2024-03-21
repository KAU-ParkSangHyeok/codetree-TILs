import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        //                          0     1      2     3       4      5      6      7
        String[] day = new String[]{"", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] date = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int elapsedDate1 = 0;
        int elapsedDate2 = 0;

        for( int i = 1 ; i < m1 ; i++){
            elapsedDate1 += date[i];
        }
        elapsedDate1 += d1;

        for( int i = 1 ; i < m2 ; i++){
            elapsedDate2 += date[i];
        }
        elapsedDate2 += d2;

        int elapsed = elapsedDate1 - elapsedDate2;
        if(elapsed < 0)
            elapsed *= -1;

        if( elapsedDate1 > elapsedDate2){
            elapsed %= 7;

            if(elapsed == 0)
                System.out.print(day[1]);
            else
                System.out.print(day[8-elapsed]);
        }
        else if( elapsedDate1 < elapsedDate2){
            elapsed %= 7;

            if(elapsed == 0)
                System.out.print(day[1]);
            else
                System.out.print(day[1+elapsed]);
        }
        else
            System.out.print(day[1]);
    }
}