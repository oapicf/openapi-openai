@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateImageRequest(
    @field:JsonProperty("prompt")
    val prompt: kotlin.String,

    @field:JsonProperty("model")
    val model: CreateImageRequestModel? = null,

    @field:JsonProperty("n")
    val n: kotlin.Int? = 1,

    @field:JsonProperty("quality")
    val quality: kotlin.String? = Quality.standard,

    @field:JsonProperty("response_format")
    val responseFormat: kotlin.String? = ResponseFormat.url,

    @field:JsonProperty("size")
    val propertySize: kotlin.String? = PropertySize._1024x1024,

    @field:JsonProperty("style")
    val style: kotlin.String? = Style.vivid,

    @field:JsonProperty("user")
    val user: kotlin.String? = null,

)
