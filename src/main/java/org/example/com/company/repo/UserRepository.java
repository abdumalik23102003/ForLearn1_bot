package org.example.com.company.repo;

import org.example.com.company.model.Client;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository {
    ArrayList<Client> USERS = new ArrayList<>();
    List<Long> ADMIN_LIST = List.of(1176805889L);

}
