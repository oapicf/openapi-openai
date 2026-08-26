package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.InviteProjectsInner
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
 * Represents an individual `invite` to the organization.
 * @param &#x60;object&#x60; The object type, which is always `organization.invite`
 * @param id The identifier, which can be referenced in API endpoints
 * @param email The email address of the individual to whom the invite was sent
 * @param role `owner` or `reader`
 * @param status `accepted`,`expired`, or `pending`
 * @param invitedAt The Unix timestamp (in seconds) of when the invite was sent.
 * @param expiresAt The Unix timestamp (in seconds) of when the invite expires.
 * @param acceptedAt The Unix timestamp (in seconds) of when the invite was accepted.
 * @param projects The projects that were granted membership upon acceptance of the invite.
 */
data class Invite(

    @Schema(required = true, description = "The object type, which is always `organization.invite`")
    @param:JsonProperty("object")
    @get:JsonProperty("object", required = true) val `object`: Invite.`Object`,

    @Schema(required = true, description = "The identifier, which can be referenced in API endpoints")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(required = true, description = "The email address of the individual to whom the invite was sent")
    @param:JsonProperty("email")
    @get:JsonProperty("email", required = true) val email: kotlin.String,

    @Schema(required = true, description = "`owner` or `reader`")
    @param:JsonProperty("role")
    @get:JsonProperty("role", required = true) val role: Invite.Role,

    @Schema(required = true, description = "`accepted`,`expired`, or `pending`")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: Invite.Status,

    @Schema(required = true, description = "The Unix timestamp (in seconds) of when the invite was sent.")
    @param:JsonProperty("invited_at")
    @get:JsonProperty("invited_at", required = true) val invitedAt: kotlin.Int,

    @Schema(required = true, description = "The Unix timestamp (in seconds) of when the invite expires.")
    @param:JsonProperty("expires_at")
    @get:JsonProperty("expires_at", required = true) val expiresAt: kotlin.Int,

    @Schema(description = "The Unix timestamp (in seconds) of when the invite was accepted.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("accepted_at")
    @get:JsonProperty("accepted_at") val acceptedAt: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "The projects that were granted membership upon acceptance of the invite.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("projects")
    @get:JsonProperty("projects") val projects: kotlin.collections.List<InviteProjectsInner>? = null
) {

    /**
    * The object type, which is always `organization.invite`
    * Values: organizationPeriodInvite
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        organizationPeriodInvite("organization.invite");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum '&#x60;Object&#x60;'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Role'")
            }
        }
    }

    /**
    * `accepted`,`expired`, or `pending`
    * Values: accepted,expired,pending
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        accepted("accepted"),
        expired("expired"),
        pending("pending");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Status'")
            }
        }
    }

}

