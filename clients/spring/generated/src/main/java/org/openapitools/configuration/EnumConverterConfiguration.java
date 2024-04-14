package org.openapitools.configuration;

import org.openapitools.model.ChatCompletionRole;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.chatCompletionRoleConverter")
    Converter<String, ChatCompletionRole> chatCompletionRoleConverter() {
        return new Converter<String, ChatCompletionRole>() {
            @Override
            public ChatCompletionRole convert(String source) {
                return ChatCompletionRole.fromValue(source);
            }
        };
    }

}
