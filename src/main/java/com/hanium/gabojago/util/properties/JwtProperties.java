package com.hanium.gabojago.util.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtProperties {
    public static String SECRETKEY;

    public JwtProperties(@Value("${jwt.secretKey}") String secretKey) {
        SECRETKEY = secretKey;
    }
}
