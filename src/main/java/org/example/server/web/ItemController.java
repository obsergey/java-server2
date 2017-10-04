package org.example.server.web;

import org.example.server.domain.Item;
import org.example.server.model.ItemData;
import org.example.server.model.ItemRequest;
import org.example.server.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ronin on 13.09.2017.
 */
@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public List<ItemData> items() {
        return itemService.items();
    }

    @GetMapping("/{id}")
    public ItemData item(@PathVariable("id") Integer id) {
        return itemService.getItem(id);
    }

    @PostMapping("/{id}")
    public ItemData update(@PathVariable("id") Integer id, @RequestBody ItemRequest request) {
        return itemService.updateItem(id, request);
    }
}
