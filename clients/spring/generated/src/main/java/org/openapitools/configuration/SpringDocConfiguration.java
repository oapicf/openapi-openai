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
                                .description("The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.")
                                .termsOfService("https://openai.com/policies/terms-of-use")
                                .contact(
                                        new Contact()
                                                .name("Cliffano Subagio")
                                                .url("https://github.com/oapicf/openapi-openai")
                                                .email("blah+oapicf@cliffano.com")
                                )
                                .license(
                                        new License()
                                                .name("MIT")
                                                .url("https://github.com/openai/openai-openapi/blob/master/LICENSE")
                                )
                                .version("2.3.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("ApiKeyAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                )
                )
        ;
    }
}