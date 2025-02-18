
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		Map<String, String> map = new HashMap<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st2 = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st2.nextToken());
		int M = Integer.parseInt(st2.nextToken());

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			String ID = st.nextToken();
			String PW = st.nextToken();
			map.put(ID, PW);

		}

		for (int i = 0; i < M; i++) {

			String ID = br.readLine();

			if (map.containsKey(ID)) {
				bw.write(map.get(ID) + "\n");
			}
		}

		bw.flush();
		br.close();
		bw.close();

	}
}
