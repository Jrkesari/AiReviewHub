package com.aihub.major.dto;

import lombok.Data;
//database ke liye ye hai
@Data
public class ProductDTO {
    private Long id;
    private String name;
    private int categoryId;
    private String description;
    private String imageName;
}
