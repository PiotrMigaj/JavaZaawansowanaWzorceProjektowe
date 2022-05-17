package pl.migibud.wzorceprojektowe.zadania.singleton.exsda.ex1;

public class Main {
    public static void main(String[] args) {

        Servers servers = Servers.getInstance();
        System.out.println(servers.addServer("http:\\wp.pl"));
        System.out.println(servers.addServer("http:\\onet.pl"));
        System.out.println(servers.addServer("https:\\wp.pl"));
        System.out.println(servers.addServer("https:\\interia.pl"));
        System.out.println();
        servers.printAllServers();
        System.out.println();
        System.out.println(servers.getHttpServers());
        System.out.println(servers.getHttpsServers());

    }
}
