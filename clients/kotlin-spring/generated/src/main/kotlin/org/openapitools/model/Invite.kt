package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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

    @Schema(example = "null", required = true, description = "The object type, which is always `organization.invite`")
    @get:JsonProperty("object", required = true) val `object`: Invite.`Object`,

    @Schema(example = "null", required = true, description = "The identifier, which can be referenced in API endpoints")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The email address of the individual to whom the invite was sent")
    @get:JsonProperty("email", required = true) val email: kotlin.String,

    @Schema(example = "null", required = true, description = "`owner` or `reader`")
    @get:JsonProperty("role", required = true) val role: Invite.Role,

    @Schema(example = "null", required = true, description = "`accepted`,`expired`, or `pending`")
    @get:JsonProperty("status", required = true) val status: Invite.Status,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) of when the invite was sent.")
    @get:JsonProperty("invited_at", required = true) val invitedAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) of when the invite expires.")
    @get:JsonProperty("expires_at", required = true) val expiresAt: kotlin.Int,

    @Schema(example = "null", description = "The Unix timestamp (in seconds) of when the invite was accepted.")
    @get:JsonProperty("accepted_at") val acceptedAt: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "The projects that were granted membership upon acceptance of the invite.")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Invite'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Invite'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Invite'")
            }
        }
    }

}

