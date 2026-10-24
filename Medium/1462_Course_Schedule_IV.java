import java.util.*;

class Solution {
    public List<Boolean> checkIfPrerequisite(
        int n, int[][] prerequisites, int[][] queries) {

        List<List<Integer>> g = new ArrayList<>();
        int[] ind = new int[n];

        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }

        for (int[] p : prerequisites) {
            g.get(p[0]).add(p[1]);
            ind[p[1]]++;
        }

        boolean[][] re = new boolean[n][n];
        Queue<Integer> qe = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (ind[i] == 0) {
                qe.offer(i);
            }
        }

        while (!qe.isEmpty()) {
            int node = qe.poll();

            for (int v : g.get(node)) {
                re[node][v] = true;

                for (int i = 0; i < n; i++) {
                    if (re[i][node]) {
                        re[i][v] = true;
                    }
                }

                ind[v]--;

                if (ind[v] == 0) {
                    qe.offer(v);
                }
            }
        }

        List<Boolean> ans = new ArrayList<>();

        for (int[] query : queries) {
            ans.add(re[query[0]][query[1]]);
        }

        return ans;
    }
}
