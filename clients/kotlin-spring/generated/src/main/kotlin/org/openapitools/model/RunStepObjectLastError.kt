package org.openapitools.model

import java.util.Objects
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
 * The last error associated with this run step. Will be `null` if there are no errors.
 * @param code One of `server_error` or `rate_limit_exceeded`.
 * @param message A human-readable description of the error.
 */
data class RunStepObjectLastError(

    @Schema(example = "null", required = true, description = "One of `server_error` or `rate_limit_exceeded`.")
    @get:JsonProperty("code", required = true) val code: RunStepObjectLastError.Code,

    @Schema(example = "null", required = true, description = "A human-readable description of the error.")
    @get:JsonProperty("message", required = true) val message: kotlin.String
) {

    /**
    * One of `server_error` or `rate_limit_exceeded`.
    * Values: server_error,rate_limit_exceeded
    */
    enum class Code(val value: kotlin.String) {

        @JsonProperty("server_error") server_error("server_error"),
        @JsonProperty("rate_limit_exceeded") rate_limit_exceeded("rate_limit_exceeded")
    }

}

