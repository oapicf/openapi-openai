package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CreateImageRequestModel
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
 * @param prompt A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
 * @param model 
 * @param n The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
 * @param quality The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
 * @param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
 * @param propertySize The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
 * @param style The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 */
data class CreateImageRequest(

    @Schema(example = "A cute baby sea otter", required = true, description = "A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.")
    @get:JsonProperty("prompt", required = true) val prompt: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("model") val model: CreateImageRequestModel? = null,

    @get:Min(1)
    @get:Max(10)
    @Schema(example = "1", description = "The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.")
    @get:JsonProperty("n") val n: kotlin.Int? = 1,

    @Schema(example = "standard", description = "The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.")
    @get:JsonProperty("quality") val quality: CreateImageRequest.Quality? = Quality.standard,

    @Schema(example = "url", description = "The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.")
    @get:JsonProperty("response_format") val responseFormat: CreateImageRequest.ResponseFormat? = ResponseFormat.url,

    @Schema(example = "1024x1024", description = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.")
    @get:JsonProperty("size") val propertySize: CreateImageRequest.PropertySize? = PropertySize._1024x1024,

    @Schema(example = "vivid", description = "The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.")
    @get:JsonProperty("style") val style: CreateImageRequest.Style? = Style.vivid,

    @Schema(example = "user-1234", description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
    @get:JsonProperty("user") val user: kotlin.String? = null
) {

    /**
    * The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
    * Values: standard,hd
    */
    enum class Quality(val value: kotlin.String) {

        @JsonProperty("standard") standard("standard"),
        @JsonProperty("hd") hd("hd")
    }

    /**
    * The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
    * Values: url,b64_json
    */
    enum class ResponseFormat(val value: kotlin.String) {

        @JsonProperty("url") url("url"),
        @JsonProperty("b64_json") b64_json("b64_json")
    }

    /**
    * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
    * Values: _256x256,_512x512,_1024x1024,_1792x1024,_1024x1792
    */
    enum class PropertySize(val value: kotlin.String) {

        @JsonProperty("256x256") _256x256("256x256"),
        @JsonProperty("512x512") _512x512("512x512"),
        @JsonProperty("1024x1024") _1024x1024("1024x1024"),
        @JsonProperty("1792x1024") _1792x1024("1792x1024"),
        @JsonProperty("1024x1792") _1024x1792("1024x1792")
    }

    /**
    * The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
    * Values: vivid,natural
    */
    enum class Style(val value: kotlin.String) {

        @JsonProperty("vivid") vivid("vivid"),
        @JsonProperty("natural") natural("natural")
    }

}

