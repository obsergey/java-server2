package org.example.server.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ronin on 13.09.2017.
 */
@Data
@Entity
@Table(name = "my_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "total_price")
    private Integer totalPrice;

    @Column(name = "count")
    private Integer count;

    @ManyToMany()
    private List<Item> items;
}
