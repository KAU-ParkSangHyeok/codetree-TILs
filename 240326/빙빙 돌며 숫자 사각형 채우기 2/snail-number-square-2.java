import java.util.Scanner;

public class Main {
    public static boolean inRange(int x, int y){
        return (x>=0 && x<n && y>=0 && y<m);
    }

    public static int rotate(int dn){
        return (dn+3)%4;
    }

    public static int n, m, x=0, y=0;
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};
                                     //E  N   W  S
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        
        int[][] arr = new int[n][m];

        int cnt = 1;
        arr[0][0] = cnt;
        
        int dirNum = 1;

        for(int i = 0 ; i < n*m - 1 ; i++){
            int nx = x + dx[dirNum], ny = y + dy[dirNum];
            if(!inRange(nx, ny) || arr[nx][ny] != 0){
                dirNum = rotate(dirNum);
            }

            cnt++;
            x += dx[dirNum];  y += dy[dirNum];
            arr[x][y] = cnt;
        }
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
            
        

    }
}