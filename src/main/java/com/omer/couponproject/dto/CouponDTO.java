package com.omer.couponproject.dto;

import com.omer.couponproject.enums.tables.Category;
import lombok.*;

import java.time.LocalDate;

@Data
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CouponDTO {

    private long id;
    public long companyId;
    public Category category;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private int amount;
    private double price;
    private String image;

}
