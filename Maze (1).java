class Maze {
    public static boolean fun(int[][] a, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= a.length || j < 0 || j >= a[0].length) {
            return false;
        }
        if (a[i][j] == 0 || visited[i][j]) {
            return false;
        }
        if (i == a.length - 1 && j == a[0].length - 1) {
            return true;
        }
        visited[i][j] = true;  

        boolean found = fun(a, i - 1, j, visited) ||
                        fun(a, i + 1, j, visited) ||
                        fun(a, i, j - 1, visited) ||
                        fun(a, i, j + 1, visited);

        return found;
    }
    public static void main(String[] args) {
        int[][] a = {
            {1,1,1,0},
            {0,0,1,1},
            {0,1,1,0},
            {1,0,0,1}
        };
        boolean[][] visited = new boolean[a.length][a[0].length];
        
        if (fun(a, 0, 0, visited)) {
            System.out.println("way FOUND");
        } else {
            System.out.println("no way FOUND");
        }
    }
}
