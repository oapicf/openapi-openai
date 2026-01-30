package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AuditLogActorApiKey
import org.openapitools.model.AuditLogActorSession
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
 * The actor who performed the audit logged action.
 * @param type The type of actor. Is either `session` or `api_key`.
 * @param session 
 * @param apiKey 
 */
data class AuditLogActor(

    @Schema(example = "null", description = "The type of actor. Is either `session` or `api_key`.")
    @get:JsonProperty("type") val type: AuditLogActor.Type? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("session") val session: AuditLogActorSession? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("api_key") val apiKey: AuditLogActorApiKey? = null
) {

    /**
    * The type of actor. Is either `session` or `api_key`.
    * Values: session,api_key
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        session("session"),
        api_key("api_key");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AuditLogActor'")
            }
        }
    }

}

