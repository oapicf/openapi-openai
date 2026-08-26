@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProjectRateLimit(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("model")
    val model: kotlin.String,

    @field:JsonProperty("max_requests_per_1_minute")
    val maxRequestsPer1Minute: kotlin.Int,

    @field:JsonProperty("max_tokens_per_1_minute")
    val maxTokensPer1Minute: kotlin.Int,

    @field:JsonProperty("max_images_per_1_minute")
    val maxImagesPer1Minute: kotlin.Int? = null,

    @field:JsonProperty("max_audio_megabytes_per_1_minute")
    val maxAudioMegabytesPer1Minute: kotlin.Int? = null,

    @field:JsonProperty("max_requests_per_1_day")
    val maxRequestsPer1Day: kotlin.Int? = null,

    @field:JsonProperty("batch_1_day_max_input_tokens")
    val batch1DayMaxInputTokens: kotlin.Int? = null,

)
