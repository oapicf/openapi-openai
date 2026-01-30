package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ProjectApiKeyOwner
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
 * Represents an individual API key in a project.
 * @param &#x60;object&#x60; The object type, which is always `organization.project.api_key`
 * @param redactedValue The redacted value of the API key
 * @param name The name of the API key
 * @param createdAt The Unix timestamp (in seconds) of when the API key was created
 * @param id The identifier, which can be referenced in API endpoints
 * @param owner 
 */
data class ProjectApiKey(

    @Schema(example = "null", required = true, description = "The object type, which is always `organization.project.api_key`")
    @get:JsonProperty("object", required = true) val `object`: ProjectApiKey.`Object`,

    @Schema(example = "null", required = true, description = "The redacted value of the API key")
    @get:JsonProperty("redacted_value", required = true) val redactedValue: kotlin.String,

    @Schema(example = "null", required = true, description = "The name of the API key")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) of when the API key was created")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "The identifier, which can be referenced in API endpoints")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("owner", required = true) val owner: ProjectApiKeyOwner
) {

    /**
    * The object type, which is always `organization.project.api_key`
    * Values: organizationPeriodProjectPeriodApi_key
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        organizationPeriodProjectPeriodApi_key("organization.project.api_key");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProjectApiKey'")
            }
        }
    }

}

