package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.InviteRequestProjectsInner
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
 * @param email Send an email to this address
 * @param role `owner` or `reader`
 * @param projects An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
 */
data class InviteRequest(

    @Schema(example = "null", required = true, description = "Send an email to this address")
    @get:JsonProperty("email", required = true) val email: kotlin.String,

    @Schema(example = "null", required = true, description = "`owner` or `reader`")
    @get:JsonProperty("role", required = true) val role: InviteRequest.Role,

    @field:Valid
    @Schema(example = "null", description = "An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.")
    @get:JsonProperty("projects") val projects: kotlin.collections.List<InviteRequestProjectsInner>? = null
) {

    /**
    * `owner` or `reader`
    * Values: reader,owner
    */
    enum class Role(@get:JsonValue val value: kotlin.String) {

        reader("reader"),
        owner("owner");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Role {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'InviteRequest'")
            }
        }
    }

}

