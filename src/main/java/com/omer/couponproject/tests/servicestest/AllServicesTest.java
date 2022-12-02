package com.omer.couponproject.tests.servicestest;

import com.omer.couponproject.tests.servicestest.testsUtils.CreatingCompanies;
import com.omer.couponproject.tests.servicestest.testsUtils.CreatingCustomers;
import com.omer.couponproject.dto.CompanyDTO;
import com.omer.couponproject.dto.CustomerDTO;
import com.omer.couponproject.enums.tables.Category;
import com.omer.couponproject.errors.exceptions.CouponAppException;
import com.omer.couponproject.services.AdminService;
import com.omer.couponproject.services.CompanyService;
import com.omer.couponproject.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class AllServicesTest implements CommandLineRunner {
    private final AdminService adminService;
    private final CompanyService companyService;
    private final CustomerService customerService;

    //    -----------------------------------------------------------------------------------------------------------------//
//     Run Method:
//    -----------------------------------------------------------------------------------------------------------------//
    @Override
    public void run(String... args) throws Exception {
        allServicesTest();
    }

    //-----------------------------------------------------------------------------------------------------------------//
    // Run Method - using to Run the class Tests :
    //-----------------------------------------------------------------------------------------------------------------//
    public void allServicesTest() {
        //adminMethodsTest();
        //companyMethodsTest();
        //customerMethodsTest();
    }
    //-----------------------------------------------------------------------------------------------------------------//


    //--------------------------* Admin Service Methods Tests *--------------------------//
    public void adminMethodsTest() {
        // Create Admin:
        createAdmin();
        // Creating All Companies:
//        createCompaniesTest();
        // Creating All Customers:
//        createCustomersTest();
        // Getting & Printing All Companies:
//        getAllCompaniesTest();
        // Getting & Printing All Companies:
//        getAllCustomersTest();
        // Get & print One Company:
//        getOneCompanyTest(1L);
        // Get & print One Customer:
//        getOneCustomerTest(1L);
        // Update Company:
//        updateCompanyTest(2L);
        // Update Customer:
//        updateCustomerTest(2L);
        // Delete Company:
//        deleteCompanyTest(5L);
        // Delete Customer:
//        deleteCustomerTest(5L);
    }

    //--------------------------* Company Service Methods Tests *--------------------------//
    public void companyMethodsTest() {
        // Creating All Coupons:
        //createCouponsTest();
        // Getting & Printing All Coupons:
//        getAllCouponsTest(2L);
        // Get & print One Coupon:
//        getOneCouponTest(1L);
        //Get Company Details:
//        getCompanyDetailsTest(1L);
        //Get Coupons By Category:
//        getAllCompanyCouponsByCategoryTest(1L, BEVERAGE);
        //Get Coupons By Max Price:
//        getAllCompanyCouponsByPriceTest(1L, 10.0);
        // Update Coupon:
//        updateCouponTest(1L,2L);
        // Delete Coupon:
//        deleteCouponTest(3L);

    }

    //--------------------------* Customer Service Methods Tests *--------------------------//
/*    public void customerMethodsTest() {
        purchaseCouponTest(1L, 1L);
        purchaseCouponTest(1L, 2L);
        purchaseCouponTest(1L, 7L);
        purchaseCouponTest(1L, 9L);*/
//        getCustomerCouponsTest(1L);
//        getCustomerCouponsByCategoryTest(1L,BEVERAGE);
//        getCustomerCouponsByPriceTest(1L,5.00);
//        getCustomerDetailsTest(1L);




    //-------------------------- Admin-To-Admin Methods Tests ----------------------------//
    public void createAdmin(){
        adminService.createAdmin();
    }

    //-------------------------- Admin-To-Company Methods Tests --------------------------//
    // Test Create Company:
    public void createCompaniesTest() {
        adminService.createCompany(CreatingCompanies.ampmCompanyCreate());
        adminService.createCompany(CreatingCompanies.superYudaCompanyCreate());
        adminService.createCompany(CreatingCompanies.dominosCompanyCreate());
        adminService.createCompany(CreatingCompanies.mcdonaldsCompanyCreate());
        adminService.createCompany(CreatingCompanies.shupersalCompanyCreate());
        adminService.createCompany(CreatingCompanies.osheradCompanyCreate());
        adminService.createCompany(CreatingCompanies.ivoryCompanyCreate());
        adminService.createCompany(CreatingCompanies.kspCompanyCreate());
        adminService.createCompany(CreatingCompanies.yelpCompanyCreate());
        adminService.createCompany(CreatingCompanies.tripadvisorCompanyCreate());
        adminService.createCompany(CreatingCompanies.airbnbCompanyCreate());
        adminService.createCompany(CreatingCompanies.bookingCompanyCreate());
        adminService.createCompany(CreatingCompanies.haceremCompanyCreate());
        adminService.createCompany(CreatingCompanies.cocaColaCompanyCreate());
        adminService.createCompany(CreatingCompanies.adidasCompanyCreate());
        adminService.createCompany(CreatingCompanies.castroCompanyCreate());
    }

    //     Test Update Company:
    public void updateCompanyTest(final long companyId) throws CouponAppException {
        adminService.updateCompany(CompanyDTO.builder()
                .id(companyId)
                .name("osem")
                .email("bamba@gmal.com")
                .password("5678")
                .build());
    }

    // Test Delete Company:
    public void deleteCompanyTest(final Long companyId) {
        adminService.deleteCompany(companyId);
    }

    // Test Get All Companies:

    public void getAllCompaniesTest() {
        System.out.println(adminService.getAllCompanies().toString());

    }

    //     Test Get Company:
    public void getOneCompanyTest(final Long companyID) {
        System.out.println(adminService.getOneCompany(companyID));
    }


    //-------------------------- Admin-To-Customer Methods Tests --------------------------//

    // Test Create Customer Method: //
    public void createCustomersTest() {
        adminService.createCustomer(CreatingCustomers.idanCreateCustomer());
        adminService.createCustomer(CreatingCustomers.orCreateCustomer());
        adminService.createCustomer(CreatingCustomers.danielCreateCustomer());
        adminService.createCustomer(CreatingCustomers.omerCreateCustomer());
        adminService.createCustomer(CreatingCustomers.davidCreateCustomer());
        adminService.createCustomer(CreatingCustomers.dorCreateCustomer());
        adminService.createCustomer(CreatingCustomers.meitalCreateCustomer());
        adminService.createCustomer(CreatingCustomers.emilCreateCustomer());
        adminService.createCustomer(CreatingCustomers.nitayCreateCustomer());
        adminService.createCustomer(CreatingCustomers.liorCreateCustomer());
        adminService.createCustomer(CreatingCustomers.tanyaCreateCustomer());

    }

    // Test Update Customer Method: //
    public void updateCustomerTest(final Long customerID) {
        adminService.updateCustomer(CustomerDTO.builder()
                .id(customerID)
                .firstName("matan")
                .lastName("tarif")
                .email("matannn@gmail.com")
                .password("matan1234")
                .build());
    }

    // Test Delete Customer Method: //
    public void deleteCustomerTest(final Long customerID) {
        adminService.deleteCustomer(customerID);
    }

    // Test Get All Customers Method: //
    public void getAllCustomersTest() {
        System.out.println(adminService.getAllCustomers().toString());
    }

    // Test Get Customer Method: //
    public void getOneCustomerTest(final Long customerID) {
        System.out.println(adminService.getOneCustomer(customerID).toString());
    }

    //-------------------------- Company-To-Coupon Methods Tests --------------------------//

    // Test Create Coupon:
/*    public void createCouponsTest() throws CouponAppException {
        companyService.createCompanyCoupon(1, CreatingCoupons.ampmCouponCreate());
        companyService.createCompanyCoupon(1, CreatingCoupons.ampm2CouponCreate());
        companyService.createCompanyCoupon(2, CreatingCoupons.superYudaCouponCreate());
        companyService.createCompanyCoupon(2, CreatingCoupons.superYuda2CouponCreate());
        companyService.createCompanyCoupon(3, CreatingCoupons.dominosCouponCreate());
        companyService.createCompanyCoupon(4, CreatingCoupons.mcdonaldsCouponCreate());
//        companyService.createCompanyCoupon(5, CreatingCoupons.shupersalCouponCreate());
        companyService.createCompanyCoupon(6, CreatingCoupons.osheradCouponCreate());
        companyService.createCompanyCoupon(7, CreatingCoupons.ivoryCouponCreate());
        companyService.createCompanyCoupon(8, CreatingCoupons.kspCouponCreate());
        companyService.createCompanyCoupon(9, CreatingCoupons.yelpCouponCreate());
        companyService.createCompanyCoupon(10, CreatingCoupons.tripAdvisorCouponCreate());
        companyService.createCompanyCoupon(11, CreatingCoupons.airbnbCouponCreate());
        companyService.createCompanyCoupon(12, CreatingCoupons.bookingCouponCreate());
        companyService.createCompanyCoupon(13, CreatingCoupons.haceremCouponCreate());
        companyService.createCompanyCoupon(14, CreatingCoupons.cocaColaCouponCreate());
        companyService.createCompanyCoupon(15, CreatingCoupons.adidasCouponCreate());
        companyService.createCompanyCoupon(16, CreatingCoupons.castroCouponCreate());

    }*/

    // Test Update Coupon:
/*    public void updateCouponTest(final Long companyID, final Long couponID) {
        companyService.updateCompanyCoupon(companyID, CouponDTO.builder()
                .id(couponID)
                .companyId(companyID)
                .title("bamba")
                .description("second bamba bag for 1NIS")
                .startDate(LocalDate.parse("2022-08-01"))
                .endDate(LocalDate.parse("2022-08-22"))
                .amount(11)
                .price(8.0)
                .category(FOOD)
                .build());
    }*/

    // Test Delete Coupon:
    public void deleteCouponTest(final Long couponID) {
        companyService.deleteCoupon(couponID);
    }

    // Test Get One Coupon:
    public void getOneCouponTest(final Long couponID) {
        System.out.println(companyService.getOneCoupon(couponID).toString());
    }

    // Test Get All Coupons:
    public void getAllCouponsTest(final Long companyID) {
        System.out.println(companyService.getAllCouponsByID(companyID).toString());
    }

    // Test Get Company Coupons By Category:
    public void getAllCompanyCouponsByCategoryTest(final Long companyID, final Category category) {
        System.out.println(companyService.getCompanyCouponsByCategory(companyID, category));
    }

    // Test Get Company Coupons By MaxPrice:
    public void getAllCompanyCouponsByPriceTest(final Long companyID, final double maxPrice) {
        System.out.println(companyService.getCompanyCouponsByPrice(companyID, maxPrice));
    }

    // Test Get Company Details:
    public void getCompanyDetailsTest(final Long companyID) {
        System.out.println(companyService.getCompanyDetails(companyID));
    }


    //-------------------------- Customer-To-Coupon Methods Tests --------------------------//

    // Test Customer Purchase Coupon:
    public void purchaseCouponTest(final Long customerID, final Long couponID) throws CouponAppException {
        customerService.purchaseCoupon(customerID, couponID);
    }

    // Test Get Customer Coupons:
    public void getCustomerCouponsTest(final Long customerID) {
        System.out.println(customerService.getCustomerCoupons(customerID));
    }

    // Test Get Customer Coupons By Category:
    public void getCustomerCouponsByCategoryTest(final Long customerID, final Category category) {
        System.out.println(customerService.getCustomerCouponsByCategory(customerID, category));
    }

    // Test Get Customer Coupons By Price:
    public void getCustomerCouponsByPriceTest(final Long customerID, final double price) {
        System.out.println(customerService.getCustomerCouponsByPrice(customerID, price));
    }

    // Test Get Customer Details:
    public void getCustomerDetailsTest(final Long customerID) {
        System.out.println(customerService.getCustomerDetails(customerID));
    }

}