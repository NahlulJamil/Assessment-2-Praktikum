import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Kota {
    int banyakKota;
    HashMap<String, Integer> namaKota = new HashMap<>();
    LinkedList<Integer>[] adjListArray;
    int index = 0;

    public Kota(int banyakKota) {
        this.banyakKota = banyakKota;
        adjListArray = new LinkedList[banyakKota];
        for (int i = 0; i < banyakKota; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public void addKota(String nama) {
        if (!namaKota.containsKey(nama)) {
            namaKota.put(nama, index);
            index++;
        }
    }

    public void addEdge(String src, String dst) {
        int from = namaKota.get(src);
        int idst = namaKota.get(dst);

        adjListArray[from].add(idst);
        adjListArray[idst].add(from);
    }

    public String getNamaFromIndex(int index) {
        for (Map.Entry<String, Integer> entry : namaKota.entrySet()) {
            if (entry.getValue() == index) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void bfs(String sourceCity) {
        boolean[] visited = new boolean[banyakKota];
        Queue<Integer> queue = new LinkedList<>();
        int start = namaKota.get(sourceCity);

        visited[start] = true;
        queue.add(start);
        int urutan = 1;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(urutan + ". " + getNamaFromIndex(node));
            System.out.println();
            urutan++;

            for (int neighbor : adjListArray[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public void dfs(String sourceCity) {
        boolean[] visited = new boolean[banyakKota];
        Stack<Integer> stack = new Stack<>();
        int start = namaKota.get(sourceCity);

        stack.push(start);
        int urutan = 1;

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(urutan + ". " + getNamaFromIndex(node));
                System.out.println();
                urutan++;

                for (int neighbor : adjListArray[node]) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    } 
}

