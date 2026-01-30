package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ProjectServiceAccountApiKey
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
 * @param &#x60;object&#x60; 
 * @param id 
 * @param name 
 * @param role Service accounts can only have one role of type `member`
 * @param createdAt 
 * @param apiKey 
 */
data class ProjectServiceAccountCreateResponse(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: ProjectServiceAccountCreateResponse.`Object`,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "Service accounts can only have one role of type `member`")
    @get:JsonProperty("role", required = true) val role: ProjectServiceAccountCreateResponse.Role,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("api_key", required = true) val apiKey: ProjectServiceAccountApiKey
) {

    /**
    * 
    * Values: organizationPeriodProjectPeriodService_account
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        organizationPeriodProjectPeriodService_account("organization.project.service_account");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProjectServiceAccountCreateResponse'")
            }
        }
    }

    /**
    * Service accounts can only have one role of type `member`
    * Values: member
    */
    enum class Role(@get:JsonValue val value: kotlin.String) {

        member("member");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Role {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProjectServiceAccountCreateResponse'")
            }
        }
    }

}

