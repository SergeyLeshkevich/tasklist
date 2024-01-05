package by.leshkevich.tasklist.service.impl;

import by.leshkevich.tasklist.service.AuthService;
import by.leshkevich.tasklist.web.dto.auth.JwtRequest;
import by.leshkevich.tasklist.web.dto.auth.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
