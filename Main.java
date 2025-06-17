public class Main {
    
    public static void main(String[] args) {
        Kota graf = new Kota(9);

        graf.addKota("Paris (France)");
        graf.addKota("Brussels (Belgium)");
        graf.addKota("Zurich (Switzerland)");
        graf.addKota("Amsterdam (Netherlands)");
        graf.addKota("Vienna (Austria)");
        graf.addKota("Prague (Czechia / Republik Ceko)");
        graf.addKota("Hamburg (Jerman)");
        graf.addKota("Warsaw (Poland)");
        graf.addKota("Budapest (Hungary)");

        graf.addEdge("Paris (France)", "Brussels (Belgium)");
        graf.addEdge("Paris (France)", "Zurich (Switzerland)");
        graf.addEdge("Brussels (Belgium)", "Zurich (Switzerland)");
        graf.addEdge("Brussels (Belgium)", "Amsterdam (Netherlands)");
        graf.addEdge("Zurich (Switzerland)", "Vienna (Austria)");
        graf.addEdge("Zurich (Switzerland)", "Prague (Czechia / Republik Ceko)");
        graf.addEdge("Amsterdam (Netherlands)", "Prague (Czechia / Republik Ceko)");
        graf.addEdge("Amsterdam (Netherlands)", "Hamburg (Jerman)");
        graf.addEdge("Vienna (Austria)", "Prague (Czechia / Republik Ceko)");
        graf.addEdge("Vienna (Austria)", "Budapest (Hungary)");
        graf.addEdge("Prague (Czechia / Republik Ceko)", "Hamburg (Jerman)");
        graf.addEdge("Prague (Czechia / Republik Ceko)", "Warsaw (Poland)");
        graf.addEdge("Hamburg (Jerman)", "Warsaw (Poland)");
        graf.addEdge("Warsaw (Poland)", "Budapest (Hungary)");

        System.out.println("a. Mulai dari kota di Perancis, kemudian mengunjungi kota di negara-negara terdekat berikutnya:");
        graf.bfs("Paris (France)");

        System.out.println();
        System.out.println();
        System.out.println("b. Mulai dari kota di Perancis, kemudian mengunjungi kota di negara yang lebih menjauh:");
        graf.dfs("Paris (France)");
    }
}
