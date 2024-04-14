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
 * 
 * @param url Either a URL of the image or the base64 encoded image data.
 * @param detail Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
 */
data class ChatCompletionRequestMessageContentPartImageImageUrl(

    @field:Valid
    @Schema(example = "null", required = true, description = "Either a URL of the image or the base64 encoded image data.")
    @get:JsonProperty("url", required = true) val url: java.net.URI,

    @Schema(example = "null", description = "Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).")
    @get:JsonProperty("detail") val detail: ChatCompletionRequestMessageContentPartImageImageUrl.Detail? = Detail.auto
) {

    /**
    * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
    * Values: auto,low,high
    */
    enum class Detail(val value: kotlin.String) {

        @JsonProperty("auto") auto("auto"),
        @JsonProperty("low") low("low"),
        @JsonProperty("high") high("high")
    }

}

