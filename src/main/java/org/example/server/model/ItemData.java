package org.example.server.model;

import lombok.Data;
import org.example.server.domain.Item;

/**
 * Created by ronin on 13.09.2017.
 */
@Data
public class ItemData {
    private Integer price;
    private String description;

    public ItemData() {}

    public ItemData(Item item) {
        this.price = item.getPrice();
        this.description = item.getDescription();
    }
}
