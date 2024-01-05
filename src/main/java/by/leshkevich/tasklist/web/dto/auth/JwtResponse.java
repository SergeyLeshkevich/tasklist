package by.leshkevich.tasklist.web.dto.auth;

import lombok.Data;

@Data
public class JwtResponse {
    private long id;
    private String username;
    private String accessToken;
    private String refreshToken;
}
