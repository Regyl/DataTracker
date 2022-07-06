package com.deepspace.datatracker.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.time.OffsetDateTime;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Comment extends AbstractEntity{

    /**
     * Дата создания комментария.
     */
    private OffsetDateTime createDttm;

    /**
     * Текст комментария.
     */
    private String text;
}
