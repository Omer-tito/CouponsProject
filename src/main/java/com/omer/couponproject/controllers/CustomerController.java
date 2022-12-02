package com.omer.couponproject.controllers;

import com.omer.couponproject.dto.CustomerDTO;
import com.omer.couponproject.dto.ResponseDTO;
import com.omer.couponproject.enums.tables.Category;
import com.omer.couponproject.errors.exceptions.CouponAppException;
import com.omer.couponproject.model.Coupon;
import com.omer.couponproject.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
@CrossOrigin

public class CustomerController {
    private final CustomerService customerService;

    //-----------------------------------------------------------------------------------------------------------------//
    // Create Customer:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/{id}/{couponId}")
    public ResponseDTO customerPurchaseCouponWeb(@PathVariable final long id , @PathVariable final long couponId) throws CouponAppException {
        customerService.purchaseCoupon(id,couponId);
        return new ResponseDTO(true, " Purchased successfully Coupon  Mazal Tov!");
    }


    //-----------------------------------------------------------------------------------------------------------------//
    // Get All Coupons:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/all/")
    public List<Coupon> getAllCouponsWeb(){
        return customerService.getAllCoupons();
    }


    //-----------------------------------------------------------------------------------------------------------------//
    // Get All customer's Customer:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/coupons/{id}")
    public List<Coupon> getAllCustomerCouponsWeb(@PathVariable final long id) throws CouponAppException {
        return customerService.getCustomerCoupons(id);
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // filter Coupons By Customer ID &  Maximum Price:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/coupons/{id}/{maxPrice}")
    public List<Coupon> getCustomerCouponsByMaxPriceWeb(@PathVariable final long id,@PathVariable final double maxPrice) throws CouponAppException {
        return customerService.getCustomerCouponsByPrice(id,maxPrice);
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // filter Customer Coupons By CustomerID Coupon Category:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/coupons/{id}/{category}")
    public List<Coupon> getCustomerCouponsByCategoryWeb(@PathVariable final long id,@PathVariable final String category) throws CouponAppException {
        return customerService.getCustomerCouponsByCategory(id, Category.valueOf(category));
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Get Customer Details By Customer ID:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/details/{id}")
    public CustomerDTO getCustomerDetailsWeb(@PathVariable final long id) throws CouponAppException {
        return customerService.getCustomerDetails(id);
    }
}
