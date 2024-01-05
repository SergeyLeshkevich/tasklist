package by.leshkevich.tasklist.service;

import by.leshkevich.tasklist.web.dto.auth.JwtRequest;
import by.leshkevich.tasklist.web.dto.auth.JwtResponse;

public interface AuthService {
    JwtResponse login(JwtRequest loginRequest);
    JwtResponse refresh(String refreshToken);
}
