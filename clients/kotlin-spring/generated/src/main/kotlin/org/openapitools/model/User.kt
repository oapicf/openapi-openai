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
 * Represents an individual `user` within an organization.
 * @param &#x60;object&#x60; The object type, which is always `organization.user`
 * @param id The identifier, which can be referenced in API endpoints
 * @param name The name of the user
 * @param email The email address of the user
 * @param role `owner` or `reader`
 * @param addedAt The Unix timestamp (in seconds) of when the user was added.
 */
data class User(

    @Schema(example = "null", required = true, description = "The object type, which is always `organization.user`")
    @get:JsonProperty("object", required = true) val `object`: User.`Object`,

    @Schema(example = "null", required = true, description = "The identifier, which can be referenced in API endpoints")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The name of the user")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "The email address of the user")
    @get:JsonProperty("email", required = true) val email: kotlin.String,

    @Schema(example = "null", required = true, description = "`owner` or `reader`")
    @get:JsonProperty("role", required = true) val role: User.Role,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) of when the user was added.")
    @get:JsonProperty("added_at", required = true) val addedAt: kotlin.Int
) {

    /**
    * The object type, which is always `organization.user`
    * Values: organizationPeriodUser
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        organizationPeriodUser("organization.user");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'User'")
            }
        }
    }

    /**
    * `owner` or `reader`
    * Values: owner,reader
    */
    enum class Role(@get:JsonValue val value: kotlin.String) {

        owner("owner"),
        reader("reader");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Role {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'User'")
            }
        }
    }

}

