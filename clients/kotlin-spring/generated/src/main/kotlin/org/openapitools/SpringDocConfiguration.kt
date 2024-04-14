package org.openapitools

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.security.SecurityScheme

@Configuration
class SpringDocConfiguration {

    @Bean
    fun apiInfo(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("OpenAI API")
                    .description("The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.")
                    .termsOfService("https://openai.com/policies/terms-of-use")
                    .contact(
                        Contact()
                            .name("Cliffano Subagio")
                            .url("https://github.com/oapicf/openapi-openai")
                            .email("blah+oapicf@cliffano.com")
                    )
                    .license(
                        License()
                            .name("MIT")
                            .url("https://github.com/openai/openai-openapi/blob/master/LICENSE")
                    )
                    .version("2.0.0")
            )
            .components(
                Components()
                    .addSecuritySchemes("ApiKeyAuth", SecurityScheme()
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("bearer")
                    )
            )
    }
}
