@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AudioResponseFormat {
    @JsonProperty(value = "json") json,
    @JsonProperty(value = "text") text,
    @JsonProperty(value = "srt") srt,
    @JsonProperty(value = "verbose_json") verbose_json,
    @JsonProperty(value = "vtt") vtt,
}
