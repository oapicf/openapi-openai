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
 * Represents an individual user in a project.
 * @param &#x60;object&#x60; The object type, which is always `organization.project.user`
 * @param id The identifier, which can be referenced in API endpoints
 * @param name The name of the user
 * @param email The email address of the user
 * @param role `owner` or `member`
 * @param addedAt The Unix timestamp (in seconds) of when the project was added.
 */
data class ProjectUser(

    @Schema(example = "null", required = true, description = "The object type, which is always `organization.project.user`")
    @get:JsonProperty("object", required = true) val `object`: ProjectUser.`Object`,

    @Schema(example = "null", required = true, description = "The identifier, which can be referenced in API endpoints")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The name of the user")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "The email address of the user")
    @get:JsonProperty("email", required = true) val email: kotlin.String,

    @Schema(example = "null", required = true, description = "`owner` or `member`")
    @get:JsonProperty("role", required = true) val role: ProjectUser.Role,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) of when the project was added.")
    @get:JsonProperty("added_at", required = true) val addedAt: kotlin.Int
) {

    /**
    * The object type, which is always `organization.project.user`
    * Values: organizationPeriodProjectPeriodUser
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        organizationPeriodProjectPeriodUser("organization.project.user");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProjectUser'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProjectUser'")
            }
        }
    }

}

