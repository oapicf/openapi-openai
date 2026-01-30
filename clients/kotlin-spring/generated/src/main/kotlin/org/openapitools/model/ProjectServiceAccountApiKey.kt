package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param &#x60;object&#x60; The object type, which is always `organization.project.service_account.api_key`
 * @param &#x60;value&#x60; 
 * @param name 
 * @param createdAt 
 * @param id 
 */
data class ProjectServiceAccountApiKey(

    @Schema(example = "null", required = true, description = "The object type, which is always `organization.project.service_account.api_key`")
    @get:JsonProperty("object", required = true) val `object`: ProjectServiceAccountApiKey.`Object`,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("value", required = true) val `value`: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String
) {

    /**
    * The object type, which is always `organization.project.service_account.api_key`
    * Values: organizationPeriodProjectPeriodService_accountPeriodApi_key
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        organizationPeriodProjectPeriodService_accountPeriodApi_key("organization.project.service_account.api_key");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProjectServiceAccountApiKey'")
            }
        }
    }

}

