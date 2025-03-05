
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	// static을쓰면 메인 밖에서도 끌어다가 쓸수있음
	static int count = 0; // 감염된 친구들 세는거임
	static List<List<Integer>> graph = new ArrayList<>(); // 이중 리스트를 사용할겁니당
	static boolean[] visited; // 양방향 그래프여서 방문했다면 true로 표시를 해줄겁니다. 안해주면 자기들끼리 무한으로 돌아버려요

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int nodes = scan.nextInt(); // 노드 개수

		visited = new boolean[nodes + 1]; // 배열 크기 지정

		for (int i = 0; i <= nodes; i++) {
			graph.add(new ArrayList<>());
		}

		int edges = scan.nextInt(); // 간선 개수

		for (int i = 0; i < edges; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			addedge(a, b); // 값 받아서 아래 addedge 메서드로 넘겨줌
		}

		dfs(1); // 문제에서 1부터 시작함

		System.out.println(count - 1); // 1을 통해서 감염된 카운트만 세는거여서 1빼줌

	}

	// 메서드

	public static void addedge(int u, int v) { // 1에서 2를 갈수있으면 2에서도 1로 갈수있음

		graph.get(u).add(v); // 입력에 1 2면 1에다가 2저장하면서
		graph.get(v).add(u); // 2에다가 1도 같이 저장함

	}

	public static void dfs(int node) {
		visited[node] = true; // 들렀던곳은 true 저장
		count++;

		for (int v : graph.get(node)) {
			if (!visited[v]) { // 방문을 안했던곳만 dfs에 값 넣어서 돌리고 카운트증가
				dfs(v);
			}
		}
	}

}