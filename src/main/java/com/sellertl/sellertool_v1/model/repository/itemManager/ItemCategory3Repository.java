package com.sellertl.sellertool_v1.model.repository.itemManager;

import java.util.List;
import java.util.Optional;

import com.sellertl.sellertool_v1.model.entity.itemManager.ItemCategory3Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemCategory3Repository extends JpaRepository<ItemCategory3Entity, Integer>{
    @Query(value = "SELECT * FROM item_category3 WHERE ic3_deleted=:deleted", nativeQuery = true)
    Optional<List<ItemCategory3Entity>> selectAllItemCategory3(int deleted);
}
