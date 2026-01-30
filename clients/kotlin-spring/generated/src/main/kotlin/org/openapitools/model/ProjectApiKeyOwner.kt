package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ProjectServiceAccount
import org.openapitools.model.ProjectUser
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
 * @param type `user` or `service_account`
 * @param user 
 * @param serviceAccount 
 */
data class ProjectApiKeyOwner(

    @Schema(example = "null", description = "`user` or `service_account`")
    @get:JsonProperty("type") val type: ProjectApiKeyOwner.Type? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("user") val user: ProjectUser? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("service_account") val serviceAccount: ProjectServiceAccount? = null
) {

    /**
    * `user` or `service_account`
    * Values: user,service_account
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        user("user"),
        service_account("service_account");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProjectApiKeyOwner'")
            }
        }
    }

}

