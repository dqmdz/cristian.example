package com.example.demo.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class Clearblade {

    @Value("${app.clearblade.configuration}")
    private String clearbladeConfiguration;

}
