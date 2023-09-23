package org.example.com.company.repo;

import org.example.com.company.model.Client;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository {
    ArrayList<Client> USERS = new ArrayList<>();
    List<Long> ADMIN_LIST = List.of(1176805889L);
    static Client getClient(Long id){
//        return USERS.forEach(client -> (Objects.equals(client.getChatId(), id)));
        return USERS.stream()
                .filter(client -> client.getChatId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
