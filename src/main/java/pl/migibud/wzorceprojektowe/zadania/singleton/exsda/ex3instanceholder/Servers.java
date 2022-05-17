package pl.migibud.wzorceprojektowe.zadania.singleton.exsda.ex3instanceholder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Servers {

    private static Servers instance;
    private final List<String> serverList;

    private Servers() {
        serverList = new ArrayList<>();
    }

    public static Servers getInstance(){
        return InstanceHolder.instance;
    }

    private static class InstanceHolder{
        public static Servers instance = new Servers();
    }

    public boolean addServer(String server){
        if (serverList.contains(server)){
            return false;
        }
        if (server.matches("^(https|http).+")){
            serverList.add(server);
            return true;
        }
        return false;
    }

    public List<String> getHttpServers(){
        return serverList.stream().filter(v->v.matches("^http[^s].+")).collect(Collectors.toUnmodifiableList());
    }

    public List<String> getHttpsServers(){
        return serverList.stream().filter(v->v.matches("^https.+")).collect(Collectors.toUnmodifiableList());
    }

    public List<String> getServersStartingWith(final String prefix){
        return serverList.stream().filter(v->v.startsWith(prefix)).collect(Collectors.toUnmodifiableList());
    }

    public void printAllServers(){
        serverList.forEach(System.out::println);
    }


}
