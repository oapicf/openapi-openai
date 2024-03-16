package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("OpenAI API")
                                .description("APIs for sampling from and fine-tuning language models")
                                .contact(
                                        new Contact()
                                                .name("Cliffano Subagio")
                                                .url("https://github.com/oapicf/openapi-openai")
                                                .email("blah+oapicf@cliffano.com")
                                )
                                .version("2.0.0")
                )
        ;
    }
}