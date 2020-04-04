package me.alphar.sca.common.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeataStorage implements Serializable {
    private Long id;
    private Long productId;
    private Integer total;
    private Integer used;
    private Integer residue;
}
