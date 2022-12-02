package com.omer.couponproject.dto;

import com.omer.couponproject.enums.tables.Role;
import lombok.*;

import java.util.List;

@Data
@ToString(exclude = "password")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CompanyDTO {

    private Long id;
    private String name;
    private String email;
    private String password;
    private List<CouponDTO> coupons;
    private Role role;

}