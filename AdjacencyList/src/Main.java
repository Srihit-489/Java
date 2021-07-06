public class Main {
    public static void main(String[] args) {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        a.addneghibor(b);
        a.addneghibor(d);
        a.addneghibor(e);

        b.addneghibor(a);
        b.addneghibor(c);
        b.addneghibor(g);

        c.addneghibor(b);

        g.addneghibor(b);
        g.addneghibor(f);

        f.addneghibor(g);

        e.addneghibor(a);

        d.addneghibor(a);
        d.addneghibor(h);


        h.addneghibor(d);

      //  BFS.traverse(a);

        DFS mydfs = new DFS();
        mydfs.dfs(a);

    }
}
