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
 * Represents an individual project.
 * @param id The identifier, which can be referenced in API endpoints
 * @param &#x60;object&#x60; The object type, which is always `organization.project`
 * @param name The name of the project. This appears in reporting.
 * @param createdAt The Unix timestamp (in seconds) of when the project was created.
 * @param status `active` or `archived`
 * @param archivedAt The Unix timestamp (in seconds) of when the project was archived or `null`.
 */
data class Project(

    @Schema(example = "null", required = true, description = "The identifier, which can be referenced in API endpoints")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always `organization.project`")
    @get:JsonProperty("object", required = true) val `object`: Project.`Object`,

    @Schema(example = "null", required = true, description = "The name of the project. This appears in reporting.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) of when the project was created.")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "`active` or `archived`")
    @get:JsonProperty("status", required = true) val status: Project.Status,

    @Schema(example = "null", description = "The Unix timestamp (in seconds) of when the project was archived or `null`.")
    @get:JsonProperty("archived_at") val archivedAt: kotlin.Int? = null
) {

    /**
    * The object type, which is always `organization.project`
    * Values: organizationPeriodProject
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        organizationPeriodProject("organization.project");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Project'")
            }
        }
    }

    /**
    * `active` or `archived`
    * Values: active,archived
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        active("active"),
        archived("archived");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Project'")
            }
        }
    }

}

