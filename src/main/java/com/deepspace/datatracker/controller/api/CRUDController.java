package com.deepspace.datatracker.controller.api;

import java.util.List;
import java.util.UUID;

public interface CRUDController<T, R> {

    List<R> getAll();

    R getById(UUID id);

    void deleteById(UUID id);

    R create(T dto);
}
