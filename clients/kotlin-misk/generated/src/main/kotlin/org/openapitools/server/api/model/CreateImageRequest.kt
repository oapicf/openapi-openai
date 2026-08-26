package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateImageRequestModel
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateImageRequest(
    /** A text description of the desired image(s). The maximum length is 1000 characters for &#x60;dall-e-2&#x60; and 4000 characters for &#x60;dall-e-3&#x60;. */
    val prompt: kotlin.String,
    val model: CreateImageRequestModel? = null,
    /** The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. */
    val n: kotlin.Int? = 1,
    /** The quality of the image that will be generated. &#x60;hd&#x60; creates images with finer details and greater consistency across the image. This param is only supported for &#x60;dall-e-3&#x60;. */
    val quality: kotlin.String? = Quality.standard,
    /** The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. */
    val responseFormat: kotlin.String? = ResponseFormat.url,
    /** The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60; for &#x60;dall-e-2&#x60;. Must be one of &#x60;1024x1024&#x60;, &#x60;1792x1024&#x60;, or &#x60;1024x1792&#x60; for &#x60;dall-e-3&#x60; models. */
    val propertySize: kotlin.String? = PropertySize._1024x1024,
    /** The style of the generated images. Must be one of &#x60;vivid&#x60; or &#x60;natural&#x60;. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for &#x60;dall-e-3&#x60;. */
    val style: kotlin.String? = Style.vivid,
    /** A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  */
    val user: kotlin.String? = null
)
