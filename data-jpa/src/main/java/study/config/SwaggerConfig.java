package study.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
    info = @Info(
        title = "API 명세서",
        description = "API 명세서 설명",
        version = "v1"))
@Configuration
public class SwaggerConfig {
    
}
