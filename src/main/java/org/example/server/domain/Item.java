package org.example.server.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ronin on 13.09.2017.
 */
@Data
@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "price")
    private Integer price;

    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable(name = "order_items",
            joinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"))
    private List<Order> orders;
}
