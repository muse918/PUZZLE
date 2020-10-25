import java.util.Stack;

public class Tower_Of_Hanoi {
    private static void printans(int n, int from, int to){
        if(n==1){
            System.out.println("크기가 "+n+"인 원판을 "+from+"번째 기둥에서"+to+"번째 기둥으로 이동");
            return;
        }
        printans(n-1, from, 6-from-to);//재귀이용->원반 n은 베이스로 생각(무시) 그리고 갈 원반이 아닌 다른 원반으로 이동
        System.out.println("크기가 "+n+"인 원판을 "+from+"번째 기둥에서"+to+"번째 기둥으로 이동");
        printans(n-1, 6-from-to, to);//재귀이용->원반 n은 베이스로 생각(무시) 그리고 다른 원반에서 갈 원반으로 이동
    }
    public static long printans(int n){
        printans(n, 1, 2);
        return (long) (Math.pow(2, n)-1);
    }
}
