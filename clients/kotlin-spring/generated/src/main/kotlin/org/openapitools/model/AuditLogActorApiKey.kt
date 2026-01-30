package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AuditLogActorServiceAccount
import org.openapitools.model.AuditLogActorUser
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
 * The API Key used to perform the audit logged action.
 * @param id The tracking id of the API key.
 * @param type The type of API key. Can be either `user` or `service_account`.
 * @param user 
 * @param serviceAccount 
 */
data class AuditLogActorApiKey(

    @Schema(example = "null", description = "The tracking id of the API key.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "The type of API key. Can be either `user` or `service_account`.")
    @get:JsonProperty("type") val type: AuditLogActorApiKey.Type? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("user") val user: AuditLogActorUser? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("service_account") val serviceAccount: AuditLogActorServiceAccount? = null
) {

    /**
    * The type of API key. Can be either `user` or `service_account`.
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AuditLogActorApiKey'")
            }
        }
    }

}

