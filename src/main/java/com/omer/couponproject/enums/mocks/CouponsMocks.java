package com.omer.couponproject.enums.mocks;

import com.omer.couponproject.enums.tables.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
//
//// Mocks for creating the Companies Coupons in the database.
public enum CouponsMocks {

    AMPM(1L, Category.BEVERAGE, "2+1 Milk", "second milk carton for free", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 10.00,"https://substackcdn.com/image/fetch/f_auto,q_auto:good,fl_progressive:steep/https%3A%2F%2Fbucketeer-e05bbc84-baa3-437e-9518-adb32be77984.s3.amazonaws.com%2Fpublic%2Fimages%2F327d019c-ba4e-4490-af9a-e13bc77c1a80_800x533.jpeg"),
    AMPM2(1L, Category.FOOD, "3+1 Chocolate", "second Chocolate box for free", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 5.00, "Chocolate image"),
    SUPERYUDA(2L, Category.FOOD, "4+1 Shampoo", "second Shampoo bottle for free", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 20.00, "Shampoo image"),
    SUPERYUDA2(2L, Category.FOOD, "1+1 Soap", "second Soap bottle for free",LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 7.00, "Soap image"),
    DOMINOS(3L, Category.JUNKFOOD, "2+1 Pizza", "second Pizza for free", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 50.00, "Pizza image"),
    MCDONALDS(4L, Category.JUNKFOOD, "3+1 Burger", "second Burger for free", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 30, "Burger image"),
    SHUPERSAL(5L, Category.ELECTRONICS, "50% Off microwave", "50% Off 200NIS", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 100.00, "micro image"),
    OSHERAD(6L, Category.BEVERAGE, "5+1 crystal", "second crystal bottle for free", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 2.00, "crystal bottle image"),
    IVORY(7L, Category.ELECTRONICS, "20% off Keyboards", "20% off Keyboards", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 50.00, "logitech keyboard image"),
    KSP(8L, Category.ELECTRONICS, "25% off Keyboards", "25% off Keyboards", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 45.00, "logitech keyboard image"),
    YELP(9L, Category.RESTAURANTS, "40% off tlv restaurants", "40% off tlv ", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 100.00, "TLV image"),
    TRIPADVISOR(10L, Category.RESTAURANTS, "40% off tlv museums", "40% off tlv  and above bill", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 75.00, "TLV image"),
    AIRBNB(11L, Category.VACATION, "50% off tlv apartments", "40% off tlv apartments only on south tlv", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 200.00, "TLV image"),
    BOOKING(12L, Category.VACATION, "40% off europe hotels", "40% off europe hotels only on winter", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 300.00, "europe"),
    HACEREM(13L, Category.BEVERAGE, "1+2 beer", "second beer bottle for free",LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 7.00, "BEER image"),
    COCACOLA(14L, Category.BEVERAGE, "1+2 cola", "second cola bottle for free", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 7.00, "COLA image"),
    ADIDAS(15L, Category.SHOES, "12% Off all the shoes", "Discount apply only on running shoes!", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 20.00, "adidas running shoes image"),
    CASTRO(16L, Category.CLOTHING, "20% Off all the jeans pants", "20% Off all the jeans", LocalDate.parse("2022-10-20"), LocalDate.parse("2023-10-22"), 2, 50.00, "jeans pants image");


    public final Long companyID;
    public final Category category;
    private final String title;
    private final String description;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final int amount;
    private final double price;
    private final String image;


}
