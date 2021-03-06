package com.study.datajpa.repository;

import com.study.datajpa.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(false)
class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void save() throws Exception {
        Item item = new Item("A");
        itemRepository.save(item);
    }

}