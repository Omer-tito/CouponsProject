package com.omer.couponproject.services;

import com.omer.couponproject.dto.JwtDTO;
import com.omer.couponproject.dto.UserDTO;
import com.omer.couponproject.enums.tables.Role;
import com.omer.couponproject.errors.exceptions.AuthException;
import com.omer.couponproject.model.Admin;
import com.omer.couponproject.model.Company;
import com.omer.couponproject.model.Customer;
import com.omer.couponproject.repositories.AdminRepository;
import com.omer.couponproject.repositories.CompanyRepository;
import com.omer.couponproject.repositories.CustomerRepository;
import com.omer.couponproject.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
@RequiredArgsConstructor
@Slf4j
@CrossOrigin("*")
public class AuthService {
    //dependencies:
    private final AuthenticationManager authenticationManager;
    private final CompanyRepository companyRepository;
    private final CustomerRepository customerRepository;
    private final AdminRepository adminRepository;

    // Authentication
    public JwtDTO authenticate(final UserDTO user) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword())
            );
            throw new AuthException("Wrong credentials Has Been entered!");
        } catch (final AuthException e) {
            log.error(e.getMessage());
        }

        // generating token by the role:
        if (user.getRole().equals(Role.COMPANY)) {
            Company company = companyRepository.findByEmail(user.getEmail());
            return new JwtDTO(JwtUtil.generateTokenCompany(company.getId(), company.getEmail(),company.getName(), Role.COMPANY));

        } else if (user.getRole().equals(Role.CUSTOMER)) {
            Customer customer = customerRepository.findByEmail(user.getEmail());
            return new JwtDTO(JwtUtil.generateTokenCustomer(customer.getId(), customer.getEmail(), customer.getFirstName(), customer.getLastName(), Role.CUSTOMER));

        } else if (user.getRole().equals(Role.ADMIN)) {
            Admin admin = adminRepository.findByEmail(user.getEmail());
            return new JwtDTO(JwtUtil.generateToken(admin.getId(),admin.getEmail() , admin.getRole()));
        }
        return null;
    }
}

