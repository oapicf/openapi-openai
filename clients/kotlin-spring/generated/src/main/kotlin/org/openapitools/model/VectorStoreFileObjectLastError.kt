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
 * The last error associated with this vector store file. Will be `null` if there are no errors.
 * @param code One of `server_error` or `rate_limit_exceeded`.
 * @param message A human-readable description of the error.
 */
data class VectorStoreFileObjectLastError(

    @Schema(example = "null", required = true, description = "One of `server_error` or `rate_limit_exceeded`.")
    @get:JsonProperty("code", required = true) val code: VectorStoreFileObjectLastError.Code,

    @Schema(example = "null", required = true, description = "A human-readable description of the error.")
    @get:JsonProperty("message", required = true) val message: kotlin.String
) {

    /**
    * One of `server_error` or `rate_limit_exceeded`.
    * Values: server_error,unsupported_file,invalid_file
    */
    enum class Code(@get:JsonValue val value: kotlin.String) {

        server_error("server_error"),
        unsupported_file("unsupported_file"),
        invalid_file("invalid_file");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Code {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'VectorStoreFileObjectLastError'")
            }
        }
    }

}

