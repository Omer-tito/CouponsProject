package com.omer.couponproject.controllers;

import com.omer.couponproject.dto.JwtDTO;
import com.omer.couponproject.dto.UserDTO;
import com.omer.couponproject.errors.exceptions.AuthException;
import com.omer.couponproject.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("authentication")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AuthController {
    private final AuthService authService;

    //-----------------------------------------------------------------------------------------------------------------//
    // Login:
    //-----------------------------------------------------------------------------------------------------------------//
    @PostMapping("login")
    public JwtDTO loginWeb(@RequestBody final UserDTO userDTO) throws AuthException {
        return authService.authenticate(userDTO);

    }
}
