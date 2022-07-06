package com.deepspace.datatracker.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@SuperBuilder
@AllArgsConstructor
public class AbstractEntity {

    /**
     * Идентификатор.
     */
    private UUID id;
}
