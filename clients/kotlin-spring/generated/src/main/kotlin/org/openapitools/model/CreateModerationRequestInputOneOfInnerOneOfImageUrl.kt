package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Contains either an image URL or a data URL for a base64 encoded image.
 * @param url Either a URL of the image or the base64 encoded image data.
 */
data class CreateModerationRequestInputOneOfInnerOneOfImageUrl(

    @field:Valid
    @Schema(example = "https://example.com/image.jpg", required = true, description = "Either a URL of the image or the base64 encoded image data.")
    @get:JsonProperty("url", required = true) val url: java.net.URI
) {

}

