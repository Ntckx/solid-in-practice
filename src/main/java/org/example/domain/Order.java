package org.example.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Builder
@Getter
public class Order {
    private final UUID id;
    private final List<Item> items;
    private final String customerEmail;
}


