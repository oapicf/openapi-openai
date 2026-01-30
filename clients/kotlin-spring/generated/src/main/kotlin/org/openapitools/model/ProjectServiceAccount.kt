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
 * Represents an individual service account in a project.
 * @param &#x60;object&#x60; The object type, which is always `organization.project.service_account`
 * @param id The identifier, which can be referenced in API endpoints
 * @param name The name of the service account
 * @param role `owner` or `member`
 * @param createdAt The Unix timestamp (in seconds) of when the service account was created
 */
data class ProjectServiceAccount(

    @Schema(example = "null", required = true, description = "The object type, which is always `organization.project.service_account`")
    @get:JsonProperty("object", required = true) val `object`: ProjectServiceAccount.`Object`,

    @Schema(example = "null", required = true, description = "The identifier, which can be referenced in API endpoints")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The name of the service account")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "`owner` or `member`")
    @get:JsonProperty("role", required = true) val role: ProjectServiceAccount.Role,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) of when the service account was created")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int
) {

    /**
    * The object type, which is always `organization.project.service_account`
    * Values: organizationPeriodProjectPeriodService_account
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        organizationPeriodProjectPeriodService_account("organization.project.service_account");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProjectServiceAccount'")
            }
        }
    }

    /**
    * `owner` or `member`
    * Values: owner,member
    */
    enum class Role(@get:JsonValue val value: kotlin.String) {

        owner("owner"),
        member("member");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Role {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProjectServiceAccount'")
            }
        }
    }

}

