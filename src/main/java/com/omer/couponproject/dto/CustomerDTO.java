package com.omer.couponproject.dto;

import com.omer.couponproject.model.Coupon;
import lombok.*;

import java.util.List;

@Data
@ToString(exclude = "password")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CustomerDTO {

        private Long id;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private List<Coupon> coupons;

}
