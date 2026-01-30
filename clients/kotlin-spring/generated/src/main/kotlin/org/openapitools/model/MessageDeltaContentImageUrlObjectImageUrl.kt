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
 * 
 * @param url The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
 * @param detail Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
 */
data class MessageDeltaContentImageUrlObjectImageUrl(

    @Schema(example = "null", description = "The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.")
    @get:JsonProperty("url") val url: kotlin.String? = null,

    @Schema(example = "null", description = "Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.")
    @get:JsonProperty("detail") val detail: MessageDeltaContentImageUrlObjectImageUrl.Detail? = Detail.auto
) {

    /**
    * Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
    * Values: auto,low,high
    */
    enum class Detail(@get:JsonValue val value: kotlin.String) {

        auto("auto"),
        low("low"),
        high("high");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Detail {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MessageDeltaContentImageUrlObjectImageUrl'")
            }
        }
    }

}

