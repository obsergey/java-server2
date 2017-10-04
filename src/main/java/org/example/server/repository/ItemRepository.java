package org.example.server.repository;

import org.example.server.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ronin on 13.09.2017.
 */
public interface ItemRepository
        extends JpaRepository<Item, Integer> {}
