package pl.migibud.wzorceprojektowe.zadania.singleton.exsda.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum Servers {

    INSTANCE;

    private final List<String> serverList;

    Servers(){
        serverList = new ArrayList<>();
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
