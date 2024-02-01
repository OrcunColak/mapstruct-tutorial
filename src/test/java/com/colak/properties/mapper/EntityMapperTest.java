package com.colak.properties.mapper;

import com.colak.properties.model.NewEntity;
import com.colak.properties.model.OldEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class EntityMapperTest {

    @Test
    void testMapIntegerToString() {
        OldEntity oldEntity = new OldEntity("name", "description", 1, List.of(1));
        NewEntity newEntity = EntityMapper.INSTANCE.mapToNewEntity(oldEntity);

        Assertions.assertEquals("name", newEntity.getName1());
        Assertions.assertEquals("description", newEntity.getDescription());
        Assertions.assertNull(newEntity.getNewField());
        Assertions.assertEquals("1", newEntity.getStringField());
        Assertions.assertEquals(List.of("1"), newEntity.getListString());

    }
}
