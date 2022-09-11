package com.webservice.sprinboot.repository;

import com.webservice.sprinboot.ws.Manager;
import com.webservice.sprinboot.ws.Role;
import com.webservice.sprinboot.ws.Store;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class StoreRepository {

    private static final Map<Integer, Store> stores = new HashMap<>();

    @PostConstruct
    public void initData() {

        Manager walter = new Manager();
        walter.setEmail("warler@mail.com");
        walter.setPassword("123");
        walter.setRole(Role.USER);

        Store awesomeStore = new Store();
        awesomeStore.setId(1);
        awesomeStore.setName("Awesome Store");
        awesomeStore.setLocation("Dublin");
        awesomeStore.setManager(walter);

        stores.put(awesomeStore.getId(), awesomeStore);

        Manager scott = new Manager();
        scott.setEmail("scott@mail.com");
        scott.setPassword("456");
        scott.setRole(Role.GUEST);

        Store fantasticStore = new Store();
        fantasticStore.setId(2);
        fantasticStore.setName("Fantastic Store");
        fantasticStore.setLocation("Copenhagen");
        fantasticStore.setManager(scott);

        stores.put(fantasticStore.getId(), fantasticStore);

        Manager homer = new Manager();
        homer.setEmail("homer@mail.com");
        homer.setPassword("qwerty");
        homer.setRole(Role.ADMIN);

        Store greatStore = new Store();
        greatStore.setId(3);
        greatStore.setName("Great Store");
        greatStore.setLocation("Springfield");
        greatStore.setManager(homer);

        stores.put(greatStore.getId(), greatStore);
    }

    public Store findStore(Integer id) {
        Assert.notNull(id, "Store ID must not be null");
        return stores.get(id);
    }

}
