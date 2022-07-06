package com.deepspace.datatracker.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class User extends AbstractEntity {

    /**
     * Логин.
     */
    private String login;

    /**
     * Дата регистрации.
     */
    private LocalDate regDate;

    /**
     * Адрес электронной почты.
     */
    private String email;

    /**
     * Идентификаторы комментариев на форуме.
     */
    private List<Comment> comments;
}
