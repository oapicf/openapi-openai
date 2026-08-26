package org.openapitools.server.api.model

import org.openapitools.server.api.model.FineTuneDPOMethod
import org.openapitools.server.api.model.FineTuneSupervisedMethod
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FineTuneMethod(
    /** The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;. */
    val type: kotlin.String? = null,
    val supervised: FineTuneSupervisedMethod? = null,
    val dpo: FineTuneDPOMethod? = null
)
