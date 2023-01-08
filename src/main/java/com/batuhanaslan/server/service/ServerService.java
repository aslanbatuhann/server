package com.batuhanaslan.server.service;

import com.batuhanaslan.server.model.Server;

import java.util.Collection;

public interface ServerService {
    Server create(Server server);

    Collection<Server> list(int limit);

    Server get(Long id);

    Server update(Server server);

    Boolean delete(Long id);
}
