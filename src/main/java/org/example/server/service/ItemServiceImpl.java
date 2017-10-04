package org.example.server.service;

import org.example.server.domain.Item;
import org.example.server.model.ItemData;
import org.example.server.model.ItemRequest;
import org.example.server.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ronin on 13.09.2017.
 */
@Service
public class ItemServiceImpl
        implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ItemData> items() {
        return itemRepository.findAll()
                .stream()
                .map(ItemData::new)
                .collect(Collectors.toList());
    }

    @Nullable
    @Override
    @Transactional(readOnly = true)
    public ItemData getItem(@Nonnull Integer itemId) {
        Item item = itemRepository.findOne(itemId);
        if (item == null) {
            throw new EntityNotFoundException("Item '" + itemId + "' not found");
        }

        return new ItemData(item);
    }

    @Override
    @Transactional
    public ItemData updateItem(Integer itemId, ItemRequest request) {
        Item item = itemRepository.findOne(itemId);
        if (item == null) {
            throw new EntityNotFoundException("Item '" + itemId + "' not found");
        }

        item.setDescription(request.getDescription());
        item.setPrice(request.getPrice());
        return new ItemData(itemRepository.save(item));
    }
}
