package com.omer.couponproject.controllers;

import com.omer.couponproject.dto.CompanyDTO;
import com.omer.couponproject.dto.CouponDTO;
import com.omer.couponproject.dto.ResponseDTO;
import com.omer.couponproject.enums.tables.Category;
import com.omer.couponproject.errors.exceptions.CouponAppException;
import com.omer.couponproject.model.Coupon;
import com.omer.couponproject.services.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("company")
@RestController
@RequiredArgsConstructor
@CrossOrigin

public class CompanyController {
    private final CompanyService companyService;

    //-----------------------------------------------------------------------------------------------------------------//
    // Create A Coupon:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create/")
    public ResponseDTO createCompanyCouponWeb(@RequestBody final CouponDTO couponDTO) throws CouponAppException {
        System.out.println(couponDTO.toString());
        companyService.createCompanyCoupon(couponDTO);
        return new ResponseDTO(true, "Successfully Created Coupon With ID: " + couponDTO.getId() + " Good Luck!");
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Delete A Customer:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("{id}")
    public ResponseDTO deleteCompanyCouponWeb(@PathVariable final long id) throws CouponAppException {
        companyService.deleteCoupon(id);
        return new ResponseDTO(true,"Company Successfully Deleted Coupon With ID: " + id + " Were Sorry For Your Loss ): ");
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Update A Customer:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/update")
    public ResponseDTO updateCompanyCouponWeb(@RequestBody final CouponDTO couponDTO) throws CouponAppException {
        companyService.updateCompanyCoupon(couponDTO);
        return new ResponseDTO(true, "Successfully Updated Coupon With ID: " + couponDTO.getId() + " Good Job!");
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Get All Company Coupons By Company ID:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/coupons/{id}")
    public List<Coupon> getAllCompanyCouponsWeb(@PathVariable final long id) throws CouponAppException {
        return companyService.getAllCouponsByID(id);
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Get One Company Coupon By CouponID:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/get/{id}")
    public CouponDTO getOneCompanyCouponWeb(@PathVariable final long id) throws CouponAppException {
        return companyService.getOneCoupon(id);
    }


    //-----------------------------------------------------------------------------------------------------------------//
    // filter Coupons By CompanyID & Maximum price:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/coupons/{id}/{maxPrice}")
    public List<Coupon> getCompanyCouponsByMaxPriceWeb(@PathVariable final long id , @PathVariable final double maxPrice) throws CouponAppException {
        return companyService.getCompanyCouponsByPrice(id,maxPrice);
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Get Company Coupons By CompanyID & Coupon Category:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/coupons/{id}/{category}")
    public List<Coupon> getCompanyCouponsByCategoryWeb(@PathVariable final long id , @PathVariable final String category ) throws CouponAppException {
        return companyService.getCompanyCouponsByCategory(id, Category.valueOf(category));
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Get Company Details:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/details/{id}")
    public CompanyDTO getCompanyDetailsWeb(@PathVariable("id") final long id) throws CouponAppException {
        return companyService.getCompanyDetails(id);
    }
}
