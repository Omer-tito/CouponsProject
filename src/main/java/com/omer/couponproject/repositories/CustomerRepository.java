package com.omer.couponproject.repositories;

import com.omer.couponproject.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    boolean existsByEmail(String email);
    Customer findByEmail(String email);
    boolean existsByEmailAndPassword(final String email, final String password);

    // this query checks if customer has a certain coupon by counting:
    @Query(value = "SELECT Count(*) FROM customer_to_coupons " +
            "WHERE coupon_id = :coupon_id AND customer_id = :customer_id" , nativeQuery = true)
            int doesCouponExistsInCustomerCoupons(@Param("customer_id") long customerId,
                                                  @Param("coupon_id") long couponId);

}

