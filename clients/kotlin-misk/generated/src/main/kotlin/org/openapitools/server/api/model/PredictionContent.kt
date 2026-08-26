package org.openapitools.server.api.model

import org.openapitools.server.api.model.PredictionContentContent
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PredictionContent(
    /** The type of the predicted content you want to provide. This type is currently always &#x60;content&#x60;.  */
    val type: kotlin.String,
    val content: PredictionContentContent
)
