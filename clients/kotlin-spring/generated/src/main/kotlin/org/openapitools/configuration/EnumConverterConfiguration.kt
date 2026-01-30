package org.openapitools.configuration

import org.openapitools.model.AudioResponseFormat
import org.openapitools.model.AuditLogEventType
import org.openapitools.model.ChatCompletionRole

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.convert.converter.Converter

/**
 * This class provides Spring Converter beans for the enum models in the OpenAPI specification.
 *
 * By default, Spring only converts primitive types to enums using Enum::valueOf, which can prevent
 * correct conversion if the OpenAPI specification is using an `enumPropertyNaming` other than
 * `original` or the specification has an integer enum.
 */
@Configuration(value = "org.openapitools.configuration.enumConverterConfiguration")
class EnumConverterConfiguration {

    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.audioResponseFormatConverter"])
    fun audioResponseFormatConverter(): Converter<kotlin.String, AudioResponseFormat> {
        return object: Converter<kotlin.String, AudioResponseFormat> {
            override fun convert(source: kotlin.String): AudioResponseFormat = AudioResponseFormat.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.auditLogEventTypeConverter"])
    fun auditLogEventTypeConverter(): Converter<kotlin.String, AuditLogEventType> {
        return object: Converter<kotlin.String, AuditLogEventType> {
            override fun convert(source: kotlin.String): AuditLogEventType = AuditLogEventType.forValue(source)
        }
    }
    @Bean(name = ["org.openapitools.configuration.EnumConverterConfiguration.chatCompletionRoleConverter"])
    fun chatCompletionRoleConverter(): Converter<kotlin.String, ChatCompletionRole> {
        return object: Converter<kotlin.String, ChatCompletionRole> {
            override fun convert(source: kotlin.String): ChatCompletionRole = ChatCompletionRole.forValue(source)
        }
    }

}
