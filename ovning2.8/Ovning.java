class Ovning {
    public static void main(String[] args) {
        var a = " Erik Andersson 860314-2714";
        a = a.trim();
        var i = a.lastIndexOf(' ') + 3;
        var j = a.lastIndexOf(' ') + 5;
        var i1 = a.lastIndexOf(' ') + 5;
        var j1 = a.lastIndexOf(' ') + 7;
        a = a.substring(i1, j1) + "/" + a.substring(i, j);
        System.out.println(a);
    }
}
