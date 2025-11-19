package com.library.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI bookLibraryOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Book Library Management API")
                        .description("REST API for managing a book library with CRUD operations, search functionality, and availability tracking")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Library API Support")
                                .email("support@library.com")));
    }
}
