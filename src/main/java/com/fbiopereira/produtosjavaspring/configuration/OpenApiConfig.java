package com.fbiopereira.produtosjavaspring.configuration;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("API de cadastro de produtos para testes diversos - v2").description(
                        "API criada em Spring Boot para exemplicar diversas algumas possibilidades do spring."));
    }
}