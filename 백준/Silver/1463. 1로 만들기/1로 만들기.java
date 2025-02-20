import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	   public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
           //답보고 이해함
	        int N = Integer.parseInt(st.nextToken());
	        int[] dp = new int[N + 1];
	        dp[0] = dp[1] = 0;

	        for (int i = 2; i <= N; i++) { // 1부터 N까지 역순으로 올라가는 거임 1을 뺀거랑 2로 나눈값 , 3으로 나눈값 비교해서 dp[i]에 저장 마지막 N번째에 dp[N]에 저장된 최소값 출력
	            dp[i] = dp[i - 1] + 1; // 1을 뺀값
	            if (i % 2 == 0) {
	                dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 1을 뺀값과 2로 나눈값중 최솟값 , Math.min = 둘중에 더 작은값을 dp[i]에 저장
	            }
	            if (i % 3 == 0) {
	                dp[i] = Math.min(dp[i], dp[i / 3] + 1); // (1을 뺀 값과 2로 나눈 값중 최솟값) 과 3으로 나눈값중 최솟값
	            }
	        }
	        System.out.println(dp[N]);
	    }
}
