@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TranscriptionWord(
    @field:JsonProperty("word")
    val word: kotlin.String,

    @field:JsonProperty("start")
    val start: kotlin.Float,

    @field:JsonProperty("end")
    val end: kotlin.Float,

)
