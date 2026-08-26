package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * The per-line object of the batch input file
 * @param customId A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
 * @param method The HTTP method to be used for the request. Currently only `POST` is supported.
 * @param url The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
 */
data class BatchRequestInput(

    @Schema(description = "A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("custom_id")
    @get:JsonProperty("custom_id") val customId: kotlin.String? = null,

    @Schema(description = "The HTTP method to be used for the request. Currently only `POST` is supported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("method")
    @get:JsonProperty("method") val method: BatchRequestInput.Method? = null,

    @Schema(description = "The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("url")
    @get:JsonProperty("url") val url: kotlin.String? = null
) {

    /**
    * The HTTP method to be used for the request. Currently only `POST` is supported.
    * Values: POST
    */
    enum class Method(@get:JsonValue val value: kotlin.String) {

        POST("POST");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Method {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Method'")
            }
        }
    }

}

