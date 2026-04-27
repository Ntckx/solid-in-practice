package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Builder
@Getter
@AllArgsConstructor
public class Item {
    private final UUID id;
    private final String itemName;
    private final double price;
}




