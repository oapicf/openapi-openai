package org.openapitools.configuration;

import java.math.BigDecimal;
import java.net.URI;
import java.util.UUID;

import org.openapitools.model.AudioResponseFormat;
import org.openapitools.model.AuditLogEventType;
import org.openapitools.model.ChatCompletionRole;

import jakarta.annotation.Generated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

/**
 * This class provides Spring Converter beans for the enum models in the OpenAPI specification.
 *
 * By default, Spring only converts primitive types to enums using Enum::valueOf, which can prevent
 * correct conversion if the OpenAPI specification is using an `enumPropertyNaming` other than
 * `original` or the specification has an integer enum.
 */
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-26T05:15:54.509838742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Configuration(value = "org.openapitools.configuration.enumConverterConfiguration")
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.audioResponseFormatConverter")
    Converter<String, AudioResponseFormat> audioResponseFormatConverter() {
        return new Converter<String, AudioResponseFormat>() {
            @Override
            public AudioResponseFormat convert(String source) {
                return AudioResponseFormat.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.auditLogEventTypeConverter")
    Converter<String, AuditLogEventType> auditLogEventTypeConverter() {
        return new Converter<String, AuditLogEventType>() {
            @Override
            public AuditLogEventType convert(String source) {
                return AuditLogEventType.fromValue(source);
            }
        };
    }
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
