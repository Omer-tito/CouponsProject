package com.omer.couponproject.controllers;

import com.omer.couponproject.dto.CompanyDTO;
import com.omer.couponproject.dto.CustomerDTO;
import com.omer.couponproject.dto.ResponseDTO;
import com.omer.couponproject.errors.exceptions.CouponAppException;
import com.omer.couponproject.model.Company;
import com.omer.couponproject.model.Customer;
import com.omer.couponproject.services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/admin")
@CrossOrigin
@Controller
@RestController
@RequiredArgsConstructor
public class AdminController {

    // Class Services
    private final AdminService adminService;

    //-----------------------------------------------------------------------------------------------------------------//
    // Create Company:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/company/")
    public ResponseDTO createCompanyWeb(@RequestBody final CompanyDTO companyDTO) throws CouponAppException {
        adminService.createCompany(companyDTO);
        return new ResponseDTO(true,"A New Company With The Name: " + companyDTO.getName() + " Created Successfully!");
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Delete Company:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/company/{id}")
    public ResponseDTO deleteCompanyWeb(@PathVariable final long id) throws CouponAppException {
        adminService.deleteCompany(id);
        return new ResponseDTO(true,"Company With ID: " + id +  "Deleted successfully ");
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Update a Given Company:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/company")
    public ResponseDTO updateCompanyWeb(@RequestBody final CompanyDTO companyDTO) throws CouponAppException {
        adminService.updateCompany(companyDTO);
        return new ResponseDTO(true,"Company With ID: " + companyDTO.getId() +  " Updated successfully");
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Get All Companies:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/companies")
    public List<Company> getAllCompaniesWeb() throws CouponAppException {
        return adminService.getAllCompanies();
    }


    //-----------------------------------------------------------------------------------------------------------------//
    // Get One Company By CompanyID:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/company/{id}")
    public CompanyDTO getOneCompanyWeb(@PathVariable final long id) throws CouponAppException {
        return adminService.getOneCompany(id);
    }

    // Create Customer:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/customer")
    public ResponseDTO createCustomerWeb(@RequestBody final CustomerDTO customerDTO) throws CouponAppException {
        adminService.createCustomer(customerDTO);
        return new ResponseDTO(true,"A New Customer With The Name: " + customerDTO.getFirstName() + ", " + customerDTO.getLastName() + " Created successfully ");
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Delete Customer:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/customer/{id}")
    public ResponseDTO deleteCustomerWeb(@PathVariable final long id) throws CouponAppException {
        adminService.deleteCustomer(id);
        return new ResponseDTO(true,"Customer With ID: " + id + "Deleted successfully");
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Update a Given Customer:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/customer")
    public ResponseDTO updateCustomerWeb(@RequestBody final CustomerDTO customerDTO) throws CouponAppException {
        adminService.updateCustomer(customerDTO);
        return new ResponseDTO(true,"Customer With ID: " + customerDTO.getId() +  "Updated successfully");
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Get All Customers Web JSON:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/customers")
    public List<Customer> getAllCustomersWeb() throws CouponAppException {
        return adminService.getAllCustomers();
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Get One Customer By CustomerID:
    //-----------------------------------------------------------------------------------------------------------------//
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/customer/{id}")
    public CustomerDTO getOneCustomerWeb(@PathVariable final long id) throws CouponAppException {
        return adminService.getOneCustomer(id);
    }
}
