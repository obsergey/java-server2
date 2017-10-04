package org.example.server.service;

import org.example.server.model.ItemData;
import org.example.server.model.ItemRequest;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by ronin on 13.09.2017.
 */
public interface ItemService {

    List<ItemData> items();

    @Nullable
    ItemData getItem(@Nonnull Integer itemId);

    ItemData updateItem(Integer id, ItemRequest request);
}
